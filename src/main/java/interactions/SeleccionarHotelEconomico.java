package interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.fluentlenium.core.annotation.Page;
import userinterface.ReservaHotelUserInterface;

public class SeleccionarHotelEconomico implements Interaction {

  @Page ReservaHotelUserInterface reservaHotelUserInterface;

  private int posicionHotelMasEconomico;

  public static SeleccionarHotelEconomico segunResultadosBusqueda() {
    return instrumented(SeleccionarHotelEconomico.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    int valorHotel;
    int valorHotelMasEconomico;
    valorHotelMasEconomico =
        Integer.parseInt(
            reservaHotelUserInterface.lstValoresHoteles.get(0).getText().replace("$", ""));
    for (int i = reservaHotelUserInterface.lstValoresHoteles.size(); i > 0; i--) {
      valorHotel =
          Integer.parseInt(
              reservaHotelUserInterface.lstValoresHoteles.get(i - 1).getText().replace("$", ""));
      if (valorHotelMasEconomico >= valorHotel) {
        valorHotelMasEconomico = valorHotel;
        posicionHotelMasEconomico = i - 1;
      }
    }
    actor.attemptsTo(
        Click.on(reservaHotelUserInterface.lstReservaHoteles.get(posicionHotelMasEconomico)));
  }
}

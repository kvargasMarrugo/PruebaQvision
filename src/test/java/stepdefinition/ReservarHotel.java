package stepdefinition;

import static exception.ValorTotalReservaNoCoincide.VALOR_TOTAL_ERRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

import exception.ValorTotalReservaNoCoincide;
import interactions.SeleccionarHotelEconomico;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import questions.ValorTotalReserva;
import tasks.Buscar;

public class ReservarHotel {

  @Cuando(
      "realice la busqueda del hotel {string} con fecha de ingreso {word} y fecha de salida {word}")
  public void burcarHotel(String ubicacion, String fechaingreso, String fechaRegreso) {
    theActorInTheSpotlight().attemptsTo(Buscar.enDxhotel(ubicacion, fechaingreso, fechaRegreso));
  }

  @Cuando("seleccione el hotel con la tarifa mas ecocomica")
  public void seleccionarHotel() {
    theActorInTheSpotlight().attemptsTo(SeleccionarHotelEconomico.segunResultadosBusqueda());
  }

  @Entonces("la tarifa a  pagar por el hotel serian {word}")
  public void pagarHotel(String totalPagar) {
    theActorInTheSpotlight()
        .should(
            seeThat(ValorTotalReserva.enHotelSeleccionado(), equalTo(totalPagar))
                .orComplainWith(ValorTotalReservaNoCoincide.class, VALOR_TOTAL_ERRADO));
  }
}

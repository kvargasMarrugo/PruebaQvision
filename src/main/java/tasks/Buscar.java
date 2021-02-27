package tasks;

import static userinterface.ReservaHotelUserInterface.*;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

@AllArgsConstructor
public class Buscar implements Task {
  private final String ubicacion;
  private final String fechaSalida;
  private final String fechaRegreso;

  public static Performable enDxhotel(String ubicacion, String fechaSalida, String fechaRegreso) {
    return Tasks.instrumented(Buscar.class, ubicacion, fechaSalida, fechaRegreso);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(TXT_UBICACION));
    actor.attemptsTo(
        Click.on(
            "//*[@class='dx-item-content dx-list-item-content' and contains(text(),'"
                + ubicacion
                + "')]"));
    actor.attemptsTo(
        Enter.theValue(fechaSalida).into(TXT_FECHASALIDA).thenHit(Keys.TAB),
        Enter.theValue(fechaRegreso).into(TXT_FECHAREGRESO).thenHit(Keys.TAB),
        Click.on(BTN_INICIAR_BUSQUEDA));
    actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());
  }
}

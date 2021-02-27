package questions;

import static net.serenitybdd.screenplay.questions.Text.of;
import static userinterface.ReservaHotelUserInterface.LBL_VALOR_TOTAL_RESERVA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorTotalReserva implements Question<String> {

  public static ValorTotalReserva enHotelSeleccionado() {
    return new ValorTotalReserva();
  }

  @Override
  public String answeredBy(Actor actor) {
    return of(LBL_VALOR_TOTAL_RESERVA).viewedBy(actor).asString();
  }
}

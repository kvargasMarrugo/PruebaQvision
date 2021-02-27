package userinterface;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ReservaHotelUserInterface extends PageObject {

  public static final Target TXT_UBICACION =
      Target.the("Ingresar Ubicacion").located(By.xpath("//input[contains(@id, 'location')]"));
  public static final Target TXT_FECHASALIDA =
      Target.the("Ingresar Fecha de salida").located(By.xpath("//input[contains(@id, 'checkIn')]"));
  public static final Target TXT_FECHAREGRESO =
      Target.the("Ingresar Fecha de regreso")
          .located(By.xpath("//input[contains(@id, 'checkOut')]"));
  public static final Target BTN_INICIAR_BUSQUEDA =
      Target.the("Boton Iniciar Sesion")
          .located(By.xpath("//*[@class='dx-button-text' and contains(.,'SEARCH')]"));

  public static final Target LBL_VALOR_TOTAL_RESERVA =
      Target.the("").located(By.xpath("//h4[@class='total-price']"));

  @FindBy(xpath = "//p[@class='rate-number']")
  public List<WebElementFacade> lstValoresHoteles;

  @FindBy(
      xpath =
          "//div[@class='book-it gray-button dx-button dx-button-normal dx-button-mode-contained dx-widget dx-button-has-text']//span[@class='dx-button-text'][1]")
  public List<WebElementFacade> lstReservaHoteles;
}

package exception;

public class ValorTotalReservaNoCoincide extends AssertionError {

  public static final String VALOR_TOTAL_ERRADO = "ELAEALDASD ASD A AD";

  public ValorTotalReservaNoCoincide(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}

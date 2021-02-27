package stepdefinition;

import static net.serenitybdd.screenplay.actors.OnStage.*;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Abrir;

public class ConfigurarInicial {
  @Before
  public void configurarActor() {
    setTheStage(new OnlineCast());
    theActorCalled("Karelys");
  }

  @Dado("que carolina esta en la pagina de {string}")
  public void que_carolina_esta_en_la_pagina_de_DXHotels(String nombrePagina) {
    theActorInTheSpotlight().attemptsTo(Abrir.pagina(nombrePagina));
  }
}

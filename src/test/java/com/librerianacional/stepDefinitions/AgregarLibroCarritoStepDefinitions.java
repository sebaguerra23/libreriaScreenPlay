package com.librerianacional.stepDefinitions;

import com.librerianacional.questions.ValidarUsuario;
import com.librerianacional.taks.AgregarLibroCarritoTaks;
import com.librerianacional.taks.RegistroUsuarioTaks;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarLibroCarritoStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Cuando("el usuario busque el libro para agregarlo al carrito de compra")
    public void elUsuarioBusqueElLibroParaAgregarloAlCarritoDeCompra() {
        theActorInTheSpotlight().attemptsTo(
                AgregarLibroCarritoTaks.on()


        );
    }
    @Entonces("se valida que el libro fue agregado con exito")
    public void seValidaQueElLibroFueAgregadoConExito() {

    }

}

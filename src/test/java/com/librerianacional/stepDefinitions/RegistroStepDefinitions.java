package com.librerianacional.stepDefinitions;

import com.librerianacional.questions.ValidarUsuario;
import com.librerianacional.taks.RegistroUsuarioTaks;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario encuentre la pagina de libreria nacional")
    public void queElUsuarioEncuentreLaPaginaDeLibreriaNacional() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://librerianacional.com/")
        );
    }
    @Cuando("el usuario llene el formulario")
    public void elUsuarioLleneElFormulario() {

        theActorInTheSpotlight().attemptsTo(
                RegistroUsuarioTaks.on()


        );
    }
    @Entonces("el usuario visualizara en pantalla un mensaje bienvenido a tu cuenta")
    public void elUsuarioVisualizaraEnPantallaUnMensajeBienvenidoATuCuenta() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarUsuario.on(), Matchers.equalTo(true)
                )
        );

    }
}

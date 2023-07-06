package com.librerianacional.taks;

import com.librerianacional.interactions.ObtenerPrecioMenor;
import com.librerianacional.utils.Excel;
import com.librerianacional.utils.VentanaHija;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static com.librerianacional.ui.AgregarLibroCarritoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarLibroCarritoTaks implements Task {
    Excel excel= new Excel();
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    WaitUntil.the( BTN_BUSCAR_LIBRO, isClickable() ).forNoMoreThan( 30 ).seconds(),
                    Click.on(BTN_BUSCAR_LIBRO),
                    Enter.theValue( excel.leerDatosExcel( "Data.xlsx","Registros",1,7) ).into( TXT_BUSCAR_LIBRO ).thenHit( Keys.ENTER ),
                    WaitUntil.the( LBL_OCULTAR_FILTRO, isClickable() ).forNoMoreThan( 30 ).seconds(),
                    ObtenerPrecioMenor.on(),
                    WaitUntil.the( LBL_PRECIO, isClickable() ).forNoMoreThan( 30 ).seconds(),
                    WaitUntil.the( BTN_AGREGAR_CARRITO, isClickable() ).forNoMoreThan( 30 ).seconds(),
                    Click.on(BTN_AGREGAR_CARRITO),
                    VentanaHija.change( BrowseTheWeb.as(actor).getDriver().getWindowHandle()),
                    WaitUntil.the( TITULO_LIBRO, isVisible() ).forNoMoreThan( 10 ).seconds()

            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Performable on(){

        return Tasks.instrumented( AgregarLibroCarritoTaks.class);
    }

    }


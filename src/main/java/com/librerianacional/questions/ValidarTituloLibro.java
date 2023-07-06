package com.librerianacional.questions;

import com.librerianacional.utils.Excel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;

import static com.librerianacional.ui.AgregarLibroCarritoUI.*;

public class ValidarTituloLibro implements Question{

    Excel excel = new Excel();

   @Override
    public Object answeredBy(Actor actor) {

        WebElementFacade mensaje = TITULO_LIBRO.resolveFor(actor);
        String nombreMensajeBienvenida = mensaje.getText();

        System.out.println("este es el texto:"+nombreMensajeBienvenida);

        try {
            return (excel.leerDatosExcel( "Data.xlsx", "Titulo",1,0 )).equals(nombreMensajeBienvenida);
        } catch (IOException e) {
            throw new RuntimeException( e );
        }
    }
    public static Question<Boolean> on(){
        return  new ValidarTituloLibro();
    }

}

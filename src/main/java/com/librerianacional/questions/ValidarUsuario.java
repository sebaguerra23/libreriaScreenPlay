package com.librerianacional.questions;

import com.librerianacional.utils.Excel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;

import static com.librerianacional.ui.RegistroUsuarioUI.LBL_MENSAJE_BIENVENIDA;

public class ValidarUsuario implements Question {

    Excel excel = new Excel();
    @Override
    public Object answeredBy(Actor actor) {

        WebElementFacade mensaje = LBL_MENSAJE_BIENVENIDA.resolveFor(actor);
        String nombreMensajeBienvenida = mensaje.getText();

        try {
            return (excel.leerDatosExcel( "Data.xlsx", "Validacion",1,1 )).equals(nombreMensajeBienvenida);
        } catch (IOException e) {
            throw new RuntimeException( e );
        }
    }
    public static Question<Boolean> on(){
        return  new ValidarUsuario();
    }

    }


package com.librerianacional.taks;

import com.librerianacional.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static com.librerianacional.ui.RegistroUsuarioUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegistroUsuarioTaks implements Task {
  Excel excel = new Excel();
    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            actor.attemptsTo(
                    WaitUntil.the( BTN_MI_CUENTA, isClickable() ).forNoMoreThan( 60 ).seconds(),
                    Click.on(BTN_MI_CUENTA),
                    WaitUntil.the( BTN_ENTRAR_REGISTRO, isClickable() ).forNoMoreThan( 30 ).seconds(),
                    Click.on(BTN_ENTRAR_REGISTRO),
                    WaitUntil.the( TXT_CORREO, isClickable() ).forNoMoreThan( 30 ).seconds(),
                    Enter.theValue( excel.leerDatosExcel( "Data.xlsx","Registros",1,0 ) ).into( TXT_CORREO ).thenHit( Keys.ENTER ),
                    Enter.theValue( excel.leerDatosExcel( "Data.xlsx","Registros",1,1 ) ).into( TXT_NOMBRE ).thenHit( Keys.ENTER ),
                    Enter.theValue( excel.leerDatosExcel( "Data.xlsx","Registros",1,2 ) ).into( TXT_APELLIDO ).thenHit( Keys.ENTER ),
                    Click.on(SELECT_TIPO_DOCUMENTO),
                    Enter.theValue( excel.leerDatosExcel( "Data.xlsx","Registros",1,3 ) ).into( TXT_NUMERO_DOCUMENTO ).thenHit( Keys.ENTER ),
                    Enter.theValue( excel.leerDatosExcel( "Data.xlsx","Registros",1,4 ) ).into( TXT_CELULAR ).thenHit( Keys.ENTER ),
                    Enter.theValue( excel.leerDatosExcel( "Data.xlsx","Registros",1,5 ) ).into( TXT_TELEFONO_FIJO ).thenHit( Keys.ENTER ),
                    Enter.theValue( excel.leerDatosExcel( "Data.xlsx","Registros",1,6 ) ).into( TXT_CONTRASENA ).thenHit( Keys.ENTER ),
                    Enter.theValue( excel.leerDatosExcel( "Data.xlsx","Registros",1,6 ) ).into( TXT_CONFIRMAR_CONTRASENA ).thenHit( Keys.ENTER ),
                    Click.on(LBL_ACEPTAR_TERMINO_CONDICIONES),
                    Click.on(BTN_REGISTRARME),
                    WaitUntil.the( LBL_MENSAJE_BIENVENIDA, isClickable() ).forNoMoreThan( 30 ).seconds()




                    );
        } catch (IOException e) {
            throw new RuntimeException( e );
        }


    }

    public static Performable on(){

        return Tasks.instrumented(RegistroUsuarioTaks.class);
    }


    }


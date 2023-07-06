package com.librerianacional.interactions;

import com.librerianacional.utils.EscrituraExcel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.librerianacional.ui.AgregarLibroCarritoUI.*;

public class ObtenerPrecioMenor implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        //esperar 1 segundo para poder obtener el precio de forma correcta
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Obtener precios de los productos
        List<WebElementFacade> precioLibro= LBL_SELECCIONAR_LIBRO_POR_PRECIO.resolveAllFor(actor);
        List<Double> listaPrecio = new ArrayList<>();

        for (WebElementFacade element : precioLibro) {
            String precioTexto = element.getText().replaceAll("[^\\d.]", "");
            double precio = Double.parseDouble(precioTexto);
            listaPrecio.add(precio);

        }

         double precioMinimo = Collections.min(listaPrecio);
         int posicionPrecioMinimo = listaPrecio.indexOf(precioMinimo);
        NumberFormat numberFormat  =  NumberFormat.getNumberInstance();
        numberFormat.setGroupingUsed(true);
         String texto = "$"+numberFormat.format(precioMinimo);
        EscrituraExcel.escrituraExcel("Precio.xlsx",texto,1,0);
        System.out.println(texto);
        List<WebElementFacade> imagenes = IMG_LIBRO.resolveAllFor(actor);
        WebElementFacade imagenMinima = imagenes.get(posicionPrecioMinimo);
        actor.attemptsTo(
                Scroll.to( imagenMinima )
        );
        imagenMinima.click();



    }
    public static Performable on(){

        return Tasks.instrumented(ObtenerPrecioMenor.class);
    }
}

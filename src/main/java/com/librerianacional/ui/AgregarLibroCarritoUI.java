package com.librerianacional.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarLibroCarritoUI {
    public static final Target BTN_INICIO_SESION= Target.the( "Btn inicio sesion" )
            .locatedBy("(//div/a[@class='d-flex justify-content-between align-items-center dropdown-item text--blue text--xm px-0'])[3]"  );

    public static final Target BTN_INICIAR_CON_CORREO= Target.the( "Btn inicio sesion con correo" )
            .locatedBy("(//div/i[@class='icon-arrow-thin-right text--gray text--xl'])[4]"  );

    public static final Target TXT_CORREO_INICIO_SESION= Target.the( "Btn inicio sesioo con correo" )
            .locatedBy("//div/input[@type='text']"  );
    public static final Target TXT_CONTRASENA_INICIO_SESION= Target.the( "Btn inicio sesioo con contraseña" )
            .locatedBy("//div/input[@type='password']"  );
    public static final Target BTN_INICIAR_SESION= Target.the( "Btn inicio sesion" )
            .locatedBy("//div[@class='row mx-0 d-flex justify-content-center mt-4']/button[@type='submit']"  );
    public static final Target BTN_BUSCAR_LIBRO= Target.the( "btn buscar libro" )
            .locatedBy("(//div/button/i[@class='icon-search text-white text-md'])[2]"  );
    public static final Target TXT_BUSCAR_LIBRO= Target.the( "btn buscar libro" )
            .locatedBy("(//form/div/input[@type='text'])[2]" );
    public static final Target IMG_LIBRO= Target.the( "Img libro" )
            .locatedBy("//div/a[@class='d-block w-100 h-100']" );
    public static final Target BTN_AGREGAR_CARRITO= Target.the( "Btn agregar carrito" )
            .locatedBy("//div/div/button[@class='btn d-flex align-items-center py-2 px-3 btn-blue-medium border-0 border-radius-0 bs-none outline-0 text-center text--upper text-white text--xl text--extrabold h-100']" );
    public static final Target LBL_OCULTAR_FILTRO= Target.the( "LBL ocultar filtro" )
            .located( By.xpath("//span[@class='text--upper text--lgxs text--blue text--bold text--lh-1']") );
    public static final Target LBL_PRECIO= Target.the( "LBL ocultar filtro" )
            .located(By.xpath("//div/span[@class='text--blue text--lgx text--lh-1 text--bold']") );

    public static final Target TITULO_LIBRO= Target.the( "Titulo libro" )
            .located(By.xpath("//div/a[@class='text--blue text--lg text--extrabold']") );
    public static final Target LBL_SELECCIONAR_LIBRO_POR_PRECIO= Target.the( "Titulo libro" )
            .located(By.xpath("//div/span[@class='text--blue text--sm text--lh-1 text--bold']") );

    public static final Target TITULO_LIBRO_COMPARAR= Target.the( "Titulo libro" )
            .located(By.xpath("//div/a[@class='d-flex text--blue text--sm text--bold text--lh-1 book-title']") );

}

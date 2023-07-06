package com.librerianacional.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioUI {

    public static final Target BTN_MI_CUENTA= Target.the( "Btn cuenta" )
            .locatedBy("(//div[@class='dropdown dropdown-mobile h-100 align-items-center'])[2]"  );

    public static final Target BTN_ENTRAR_REGISTRO= Target.the( "Btn registrarme" )
            .locatedBy("(//div/a[@class='d-flex justify-content-between align-items-center dropdown-item text--blue text--xm px-0'])[4]"  );
    public static final Target TXT_CORREO= Target.the( "Txt correo" )
            .locatedBy("//div/input[@id='email']"  );
    public static final Target TXT_NOMBRE= Target.the( "Txt nombre" )
            .locatedBy("//div/input[@id='nombres']"  );
    public static final Target TXT_APELLIDO= Target.the( "Txt apellido" )
            .locatedBy("//div/input[@id='apellidos']"  );
    public static final Target SELECT_TIPO_DOCUMENTO= Target.the( "Select documento" )
            .locatedBy("//div/select[@name='tipo_identificacion']/option[2]"  );

    public static final Target TXT_NUMERO_DOCUMENTO= Target.the( "Txt numero documento" )
            .locatedBy("//div/input[@id='identificacion']"  );
    public static final Target TXT_CELULAR= Target.the( "Txt celular" )
            .locatedBy("//div/input[@id='telefono_movil']"  );
    public static final Target TXT_TELEFONO_FIJO= Target.the( "Txt telefono fijo" )
            .locatedBy("//div/input[@id='telefono']"  );
    public static final Target TXT_CONTRASENA= Target.the( "Txt contraseña" )
            .locatedBy("//div/input[@id='contrasena']"  );
    public static final Target TXT_CONFIRMAR_CONTRASENA= Target.the( "Txt confirmar contraseña" )
            .locatedBy("//div/input[@id='repeatContrasena']"  );
    public static final Target LBL_ACEPTAR_TERMINO_CONDICIONES= Target.the( "Lbl terminos y condiciones" )
            .locatedBy("//div/label[@class='pl-2 text--muli text--xm text--blue mb-0 pt-1']"  );
    public static final Target BTN_REGISTRARME= Target.the( "Btn registrarme" )
            .locatedBy("//div/button[@class='btn d-block px-5 py-3 btn-red-medium border-0 border-radius-0 bs-none outline-0 text-center text--upper text-white text--xl text--extrabold text--upper text-center']"  );
    public static final Target LBL_MENSAJE_BIENVENIDA= Target.the( "Lbl mensaje bienvenida" )
            .locatedBy("//div/div[@class='col-12 px-0 text--normal text--xm text--lh-normal text--blue']"  );

}

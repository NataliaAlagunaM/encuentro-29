package junit3_contraseniasseguras;

import Entity.PasswordValidator;

public class JUnit3_contraseniasSeguras {

    public static void main(String[] args) {

        PasswordValidator pass = new PasswordValidator();

        System.out.println("La contraseña es correcta? " + pass.condicional("Val1dat@"));
        System.out.println("La contraseña es correcta? " + pass.condicional("val1dat@"));
        System.out.println("La contraseña es correcta? " + pass.condicional("Validat@"));
        System.out.println("La contraseña es correcta? " + pass.condicional("Val1date"));
        System.out.println("La contraseña es correcta? " + pass.condicional("Val1dar"));
        System.out.println("La contraseña es correcta? " + pass.condicional("Val1datt@?"));
        System.out.println("La contraseña es correcta? " + pass.condicional("Vali da@e2"));
    }

}

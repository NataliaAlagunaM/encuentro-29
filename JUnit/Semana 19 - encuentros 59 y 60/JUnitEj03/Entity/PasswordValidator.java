package Entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public PasswordValidator() {
    }
    
    

    public boolean condicional(String password) {


        
        // [^a-zA-Z0-9]
        // if(placa.substring(0, 3).matches("[A-Z]*")){
// ^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$
        if (password.length() >= 8) {
            boolean mayuscula = false;
            boolean numero = false;
            boolean caractEspeciales = false;
            boolean letras = false;
            boolean espacioVacio = true;
            // int i;
            char caracter;
            //Define caracteres especiales
            Pattern special = Pattern.compile("[?!¡@¿.,´)]");
            Matcher hasSpecial = special.matcher(password);
            Pattern vacio = Pattern.compile(" ");
            Matcher hasVacio = vacio.matcher(password);

            for (int i = 0; i < password.length(); i++) {
                caracter = password.charAt(i); //mercedes#45  i=0 caracter = M

                if (Character.isDigit(caracter)) {
                    numero = true;
                }
                if (Character.isUpperCase(caracter)) {
                    mayuscula = true;
                }
                if (Character.isLetter(caracter)) {//contiene letras
                    letras = true;
                }
                if (hasSpecial.find()) {  //Contiene caracteres especiales.  ("[?!¡@¿.,´)]");

                    caractEspeciales = true;
                }
                if (hasVacio.find()) {  //Contiene espacios vacios;

                     espacioVacio = false;
                }
            }

            return numero == true && mayuscula == true && letras == true && caractEspeciales == true && espacioVacio == true;
        } else {
            return false;
        }

    }

}

//3. Validador de Contraseñas:
//Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas
//reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
//Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
//correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.

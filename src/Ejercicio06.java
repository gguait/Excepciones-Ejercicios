/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pabmar
 */
public class Ejercicio06 {
//    Escribe un método, de nombre enviarMensaje, que reciba por
//    parámetro una cadena de caracteres correspondiente a una dirección
//    de correo electrónico. El método comprobará que la dirección recibida
//    es correcta elevando la excepción DirCorreoIncorrectaExcepcion en
//    caso contrario. La comprobación consistirá en verificar que la dirección
//    contiene el carácter (@), algún carácter después de él antes del
//    carácter (.) y algún carácter después de éste
    public static void enviarMensaje(String cadena){
        int arroba = cadena.indexOf('@');
        int punto = cadena.indexOf('.');
        
        try{
            System.out.println(cadena);
            if (arroba >= 1 && (punto - arroba) >= 2 && punto < cadena.length()) {
            }
            } catch (DirCorreoIncorrectaExcepcion e) {
                    
            } finally {
                            
            }
        }
        
    }
    
    public static void main(String[] args) {
        String cadena = "correo@dominio.com";
    }
}

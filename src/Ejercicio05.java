
import java.lang.reflect.Array;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pabmar
 */
public class Ejercicio05 {
    
//    Escribe un método, de nombre mostrarCadenasArray, que reciba por
//    parámetro un array con cadenas de caracteres. El método mostrará
//    por pantalla el primer carácter de cada una de las cadenas contenidas
//    en el array.
    
    public static void mostrarCadenasArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            try{
                System.out.println(array[i].charAt(0));
            } catch (NullPointerException e){
                System.out.println("Valor nulo");
            } finally {
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        String[] array = {"primera",null,"tercera","cuarta"};
        
        mostrarCadenasArray(array);
    }
}

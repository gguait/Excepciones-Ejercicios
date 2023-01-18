/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pabmar
 */
public class ClaseExcep1 {
        
//    Escribe una clase de nombre ClaseExcep1 que incluya un método
//    denominado dividirEntreArray. Este método recibirá por parámetro un
//    número entero y un array de elementos del mismo tipo. El método
//    mostrará por pantalla el resultado de la división entre el número
//    recibido y cada uno de los elementos del array. A continuación, se
//    escribirá un programa que invoque al método con el número 2 y un
//    array con los elementos -2, -1, 0, 1 y 2.
    
    public static void dividirEntreArray(int num, int[] array){
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            
            try{
                aux = num / array[i];
                System.out.println(num+" entre "+array[i]+" es "+aux);
            } catch(ArithmeticException e) {
                System.out.println("Estas dividiendo entre cero");
            } finally{
                System.out.println("");
            }
        }
    }
    
//    Reescribe el método anterior para capturar la excepción
//    derivada del intento de división entre 0, de forma que no se
//    interrumpa la ejecución del programa y se continúe dividiendo
//    entre los otros elementos del array.

    public static void dividirEntreArray2(int num, int[] array){    
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            
            try{
                if (array[i] != 0) {
                    aux = num / array[i];
                    System.out.println(num+" entre "+array[i]+" es "+aux);
                }
            } catch(ArithmeticException e) {
                System.out.println("Estas dividiendo entre cero");
            } finally{
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = {-2, -1, 0, 1, 2};
        int num = 2;
        
        dividirEntreArray(num, array);
        System.out.println("\n\n");
        dividirEntreArray2(num, array);
    }
}

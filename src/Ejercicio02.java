/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pabmar
 */
//    Indica la salida por pantalla que produciría el siguiente código:
public class Ejercicio02 {
    
    public static int devuelveEntero(int num){
            try{
                if (num % 2 == 0) {
                    throw new Exception("Lanzando excepcion");
                }
                return 1;
            } catch (Exception e){
                return 2;
            } finally {
                return 3;
            }
        }
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(devuelveEntero(i));
        }
    }
}

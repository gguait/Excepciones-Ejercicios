
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pabmar
 */

//    Escribe un programa que lance y capture una excepción de la clase
//    Exception
public class Ejercicio01 {
    public static void main(String[] args) {
        int num = 0;
        boolean leido = false;
        Scanner lector = new Scanner(System.in);
        do {
            try {
                System.out.print("Introduce un numero entero: ");
                num = lector.nextInt();
                leido = true;
            } catch (InputMismatchException e) {
                System.out.println("Esto no es un numero entero");  
                lector.nextLine();
            }
        } while (!leido);
        System.out.println("El numero introducido es " + num);
    }
}

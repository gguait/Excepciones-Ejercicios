/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pabmar
 */
public class Entrenamiento {
    public static void main(String[] args) throws Corredor.AgotadoException {
        Corredor pepe = new Corredor(50);
        boolean continuar = true;
        int vecesAgotado=0;
        pepe.Correr();
        
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j <= (pepe.getEnergia() / 10) +1; j++) {
//                try{
//                    pepe.Correr();
//                } catch(Corredor.AgotadoException e){
//                    System.out.println("Agotado");
//                }
//            }
//            switch (i) {
//                case 0:
//                    System.out.println("\nRecarga de 30");
//                    pepe.recargarEnergia(30);
//                    break;
//                case 1:
//                    System.out.println("\nRecarga de 10");
//                    pepe.recargarEnergia(10);
//                    break;
//                case 2:
//                    System.out.println("\nEntrenamiento concluido");
//                    break;
//                default:
//                    break;
//            }
//        }
        
        do{
            try{
                pepe.Correr();
            }catch(Corredor.AgotadoException e){
                vecesAgotado++;
                switch(vecesAgotado){
                    case 1:
                        System.out.println("\nRecarga de 30");
                        pepe.recargarEnergia(30);
                        break;
                    
                    case 2:
                        System.out.println("\nRecarga de 10");
                        pepe.recargarEnergia(10);
                        break;
                    case 3:
                        continuar=false;
                        System.out.println("Terminado");
                }
            }
        } while(continuar);
    }
}

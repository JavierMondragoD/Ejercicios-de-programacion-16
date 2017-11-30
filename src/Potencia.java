/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOSE JAVIER
 */
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ingreso = new Scanner(System.in);
        int numero;
        System.out.println("Potencia de 2");
        System.out.print("Ingresa un numero: ");
        numero = ingreso.nextInt();
        Potencia(numero);     
    }//fin main

    public static void Potencia(int numero){
      int i;
      for(i = 1; i <= numero; i++){
        System.out.println(i + "^2 = " + (int)(Math.pow(i,2)) );
      }
    }
    
}

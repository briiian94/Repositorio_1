/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_6;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej1_4 {
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Escriba un programa que lea 20 números. 
        Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje 
        "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado 
        de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
        Nota: recordar el uso de la sentencia break.*/
           
        
        int num1;
           int num2=0;
           int num3=0;
       
         do {
            num3 = num3 + 1;
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num1 = leer.nextInt();
            if (num1 < 0) {  
            } else if (num3 == 20){
                break;            
            } else {
            num2 = num1+num2;
            }
        } while (num1 != 0 && num3 < 21);
        System.out.println("Se capturó el numero 0 ");
        System.out.println("La suma de los valores positivos ingresados es "+num2);
    } 
}

        
    

    





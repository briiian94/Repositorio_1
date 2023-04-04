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
public class ej2_7 {
    /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
    este tipo de dispositivo lee cadenas enviadas por el usuario. 
    Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
    el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
    la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
    y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
    e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan 
    las siguientes funciones de Java Substring(), Length(), equals().
*/
         public static void main(String[] args) {
             int conteoC = 0;
             int conteoI = 0;
             String cad;
             Scanner leer = new Scanner(System.in);
             do {
             System.out.println("Ingrese cadenas");
             cad = leer.nextLine().toUpperCase();
             if ((cad.startsWith("X")) && (cad.endsWith("O")) && (cad.length() == 5) || (cad.equals("&&&&&")) ) {
                 conteoC++;
             } else {
                 conteoI++;
             }
             } while (!cad.equals("&&&&&"));
             System.out.println("La cantidad de cadenas CORRECTAS es "+conteoC);
             System.out.println("La cantidad de cadenas INCORRECTAS es "+conteoI);
         }
}

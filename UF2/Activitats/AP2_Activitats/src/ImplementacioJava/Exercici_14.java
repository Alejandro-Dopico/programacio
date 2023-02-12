/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
 */

//Pre: Mostrarem les taules de multiplicar del 0 al 10.
public class Exercici_14 {
    
   public static void main (String [] args) {
        int tabla = 0, multiplicador = 0, resultado = 0, numtabla = 0;

        System.out.println("Tabla de multiplicar de: " + numtabla + ":");
        
        while (tabla <= 10) {
            resultado = tabla * multiplicador;
            System.out.println(tabla + " * " + multiplicador + " = " + resultado);
            multiplicador++;
            
            if (multiplicador == 11 && tabla < 11) {
                if (tabla == 10){
                    System.out.println("\nTenim les taules de multiplicar del 0 al 10");
                    break;
                }
                else {
                numtabla++;
                System.out.println("\nTabla de multiplicar del " + numtabla + ":");
                multiplicador = 0;
                tabla++;
                }
            }
        }
    }
}    
//Post: printem el resultat.

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

import java.util.Scanner;

public class Exercici_4a {
    private static final String MSG_1 = "Introdueix el mes: ";

    public static void main(String[] args) {       
        float num1;    
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
            if(num1 == 1){
                System.out.println("Enero");
            }
            else if (num1 == 2) {
                System.out.println("febrero");
            }
            else if (num1 == 3){
                System.out.println("Marzo");
            }
            else if (num1 == 4){
                System.out.println("Abril");
            }
            else if (num1 == 5) {
                System.out.println("Mayo");
            }
            else if (num1 == 6){
                System.out.println("Junio");
            }
            else if (num1 == 7){
                System.out.println("Julio");
            }
            else if (num1 == 8) {
                System.out.println("Agosto");
            }
            else if (num1 == 9){
                System.out.println("Septiembre");
            }
            else if (num1 == 10){
                System.out.println("Octubre");
            }
            else if (num1 == 11) {
                System.out.println("Noviembre");
            }
            else if (num1 == 12){
                System.out.println("Diciembre");
            }
            else if (num1 < 1 || num1 > 12){
                System.out.println("Error");
            }
        }
}    
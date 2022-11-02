/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

import java.util.Scanner;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
*/

public class Exercici_3l {
    private static final String MSG_1 = "Introdueix el número de litres: ";

    public static void main(String[] args) {     
        float num1;    
        int fixa = 6;
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
            if(num1 <= 50){
                System.out.println("La cuota a pagar es: " + fixa);
            }
            else if (num1 >= 50 && num1 <= 200) {
                total = (num1 * 0.1) + fixa;
                System.out.println("La cuota a pagar es: " + total);
            }
            else if (num1 > 200){
                total = (num1 * 0.3) + fixa;
                System.out.println("La cuota a pagar es: " + total);
            }
        }
}    
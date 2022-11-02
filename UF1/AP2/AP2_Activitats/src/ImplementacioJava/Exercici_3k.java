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

public class Exercici_3k {
    private static final String MSG_1 = "Introdueix dos números i primer el més gran: ";
    
    public static void main(String[] args) {
        float num1, num2;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
            if(num1 % num2 == 0){
                System.out.println("El valor introduït es multiple");
            }
            else {
                System.out.println("El valor introduït no es multiple");
            }
        }
}    
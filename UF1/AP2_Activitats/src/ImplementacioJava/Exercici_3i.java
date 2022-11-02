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

public class Exercici_3i {
    private static final String MSG_1 = "Introdueix un número: ";
    
    public static void main(String[] args) {
        float num1, num2;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
            if(num1 > num2){
                System.out.println("El número més gran és: " + num1);
            }
            else if(num2 > num1) {
                System.out.println("El número més gran és: " + num2);
            }           
            else {
                 System.out.println("Els números son iguals"); 
                    }
  }
}    
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

public class Exercici_3d {
    private static final String MSG_1 = "Introdueix un número: ";
    
    public static void main(String[] args) {
        float num1;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();            
            if(num1 <= 27 && num1 >= -3){
                System.out.println("El número entra en el rang");
            }
            else {
                System.out.println("El número no entra en el rang");
            }           
  }
}      
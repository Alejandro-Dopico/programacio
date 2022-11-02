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
    28/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
*/

public class Exercici_5 {
    private static final String MSG_1 = "Introdueix un any: ";
    
    public static void main(String[] args) {
        int any;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))){
            System.out.println("El año es bisiesto");
        }
        else {
            System.out.println("El año no es bisiesto");
        }
    }
}
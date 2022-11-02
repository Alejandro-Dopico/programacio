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

public class Exercici_10 {
    private static final String MSG_1 = "Introdueix dos números: ";
    private static final String MSG_2 = "El nombres múltiples de n1 són: ";
    private static final String MSG_3 = "Error: que sean positus i n1 menor que n2 ";

    public static void main(String[] args) {   
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if(n1 < 0 || n2 < 0 || n1 >= n2){
            System.out.println(MSG_3);
            System.exit(1);
        }
        System.out.println("\n" + MSG_2);
        while(n1 <= n2) {
            if(n1 % 2 == 0){
            System.out.println(n1);
            }
            n1++;
        }
}
}
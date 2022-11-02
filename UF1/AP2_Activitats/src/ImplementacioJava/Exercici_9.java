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

public class Exercici_9 {
    private static final String MSG_1 = "Introdueix números i acaba amb 0: ";
    private static final String MSG_2 = "La mitjana dels números introduïts es: ";

    public static void main(String[] args) {   
        int num, suma = 0, quantitat = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while(num != 0) {
            quantitat = quantitat + 1;
            suma = suma + num;
            num = sc.nextInt();
        }
        System.out.println(MSG_2 + (suma / quantitat));
}
}
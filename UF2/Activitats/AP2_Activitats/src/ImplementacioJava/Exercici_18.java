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

//Pre: Transformem un megabyte a byte.
public class Exercici_18 {

    private static final String MSG_1 = "Indrodueix el primer número: ";
    private static final String MSG_2 = "Indrodueix el segon número: ";
    private static final String MSG_3 = "Error, Torna a introduïr un nombre: ";
    private static final String MSG_4 = "Aquest es el primer número introduit: ";
    private static final String MSG_5 = "Aquest es el segon número introduit: ";

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, save1 = 0, save2 = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        do {
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                num1 = sc.nextInt();
            } else {
                sc.next();
                System.out.println(MSG_3);
            }
        } while (!valorCorrecte);
        System.out.println(MSG_2);
        do {
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                num2 = sc.nextInt();
            } else {
                sc.next();
                System.out.println(MSG_3);
            }
        } while (!valorCorrecte);
        save1 = num1;
        save2 = num2;
        num1 = save2;
        num2 = save1;
        System.out.println(MSG_4 + num1 + "\n" + MSG_5 + num2);
    }
}

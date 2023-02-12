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


//Pre: Guardem valors en un array.
public class Exercici_21 {

    private static final String MSG_1 = "Introduce 20 numeros: ";

    public static void main(String[] args) {
        int[] llistaNotes = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        for (int i = 0; i < llistaNotes.length - 1; i++) {
            for (int j = i + 1; i < llistaNotes.length; j++) {
                llistaNotes[i] = sc.nextInt();
                if (llistaNotes[i] > llistaNotes[j]) {
                    int canvi = llistaNotes[i];
                    llistaNotes[i] = llistaNotes[j];
                    llistaNotes[j] = canvi;
                }
            }
        }
        System.out.println("\nResultat:");
        for (int i = 0; i < llistaNotes.length - 1; i++) {
            System.out.println(llistaNotes[i] + " ");
        }
    }
}

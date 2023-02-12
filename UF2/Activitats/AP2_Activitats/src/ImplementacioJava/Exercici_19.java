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

//Pre: Introdueix dos valors i indica quina acció vols fer'hi.
public class Exercici_19 {
    private static final String MSG_1 = "Introdueix els valors: ";
    private static final String MSG_2 = "Error, aquet valor no entra en els parametres: ";
    private static final String MSG_3 = "Pasem a la seguent fila: ";
    private static final String MSG_4 = "Printem la matriu tansposta";
    
    public static void main(String[] args) {
        boolean valorCorrecte;
        int[][] arrayTwo = new int[];      
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[j].length; j++) {
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        do {
                            arrayTwo[i][j] = sc.nextInt();
                            if (arrayTwo[i][j] < 1 || arrayTwo[i][j] > 9) {
                                System.out.println(MSG_2);
                            }
                        } while (arrayTwo[i][j] < 1 || arrayTwo[i][j] > 9);
                    } else {
                        sc.next();
                        System.out.println(MSG_2);
                    }
                } while (!valorCorrecte);
            }
            if (i < 6) {
                System.out.println("\n" + MSG_3 + "\n");
            }
        }
        
    }
}

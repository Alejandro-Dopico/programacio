/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

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
    private static final String MSG_1 = "Introdueix 20 números: ";
    private static final String MSG_2 = "Aquestes son les posicions senars: ";
    private static final String MSG_3 = "Error, torna a introduïr: ";
    
    public static void main(String[] args) {
        int[] arrayEnters = new int[20];
        int i;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        for (i = 0; i < arrayEnters.length; i++) {
            do {
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    arrayEnters[i] = sc.nextInt();
                } else {
                    sc.next();
                    System.out.println("\n" + MSG_3);
                }
            } while (!valorCorrecte);
        }
        System.out.println(MSG_2 + "\n");
        for (i = 0; i < arrayEnters.length;) {
            System.out.println(arrayEnters[i]);
            i = i + 2;
        }
    }
}
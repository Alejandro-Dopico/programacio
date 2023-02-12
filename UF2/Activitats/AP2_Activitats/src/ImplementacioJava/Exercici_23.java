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

//Pre: Emmagatzema l'informacio de les 10 persones.
public class Exercici_23 {

    private static final String MSG_1 = "A continuacio emmagatzarem informació de 10 persones.\n";
    private static final String MSG_2 = "Introdueix les dades: ";
    private static final String MSG_3 = "Error, torna'hi";
    private static final String MSG_4 = "Seguent persona: ";
    private static final String MSG_5 = "Introduiex l'edat: ";
    private static final String MSG_6 = "Introduiex el sexe (H/D): ";
    private static final String MSG_7 = "Introduiex el salari: ";
    private static final String MSG_8 = "Indica si es becari (true/false): ";
    private static final int MAXALU = 10;

    public static void main(String[] args) {
        int num = 0, numpersona = 0, si;
        boolean valorCorrecte, exit = false, becariBoolean = false;
        int[] arrayEdat = new int[10];
        char[] arraySexe = new char[10];
        float[] arraySalari = new float[10];
        boolean[] arrayBecari = new boolean[10];
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        do {
            for (int i = 0; i < MAXALU; i++) {
                do {
                    System.out.println(MSG_5);
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        arrayEdat[i] = sc.nextInt();
                        if (arrayEdat[i] > 0 && arrayEdat[i] < 120) {
                            exit = true;
                        } else {
                            System.out.println("\n" + MSG_3);
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                    }
                } while (exit != true);
                exit = false;
                do {
                    System.out.println(MSG_6);
                    arraySexe[i] = sc.next().charAt(0);
                    if (arraySexe[i] == 'D' || arraySexe[i] == 'H') {
                        exit = true;
                    } else {
                        System.out.println("\n" + MSG_3);
                    }
                } while (exit != true);
                exit = false;
                do {
                    System.out.println(MSG_7);
                    valorCorrecte = sc.hasNextFloat();
                    if (valorCorrecte) {
                        arraySalari[i] = sc.nextFloat();
                        exit = true;
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                    }
                } while (exit != true && !valorCorrecte);
                exit = false;
                do {
                    System.out.println(MSG_8);
                    becariBoolean = sc.hasNextBoolean();
                    if (becariBoolean) { 
                        arrayBecari[i] = sc.nextBoolean();
                        exit = true;
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                    }
                } while (exit != true);
            }
            numpersona++;
            System.out.println(MSG_4);
        } while (numpersona == MAXALU);
    }
}

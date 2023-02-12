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
public class Exercici_13 {

    private static final String MSG_1 = "Indrodueix dos números: ";
    private static final String MSG_2 = "Error, Torna a introduïr: ";
    private static final String MSG_3 = "\nQuina opció vols?\n" + "\nFinalitzat el programa (0)" + "\nSuma (1)" + "\nResta (2)" + "\nMultiplica (3)" + "\nDivideix (4)\n";
    private static final String MSG_4 = "\nAquest es el resultat de la suma: ";
    private static final String MSG_5 = "\nAquest es el resultat de la resta: ";
    private static final String MSG_6 = "\nAquest es el resultat de la multiplicació: ";
    private static final String MSG_7 = "\nAquest es el resultat de la divició: ";
    private static final String MSG_8 = "\nEl programa a finalitzar correctament.";

    public static void main(String[] args) {
        float num1 = 0, num2 = 0, resultat = 0;
        int tipus;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        do {
            valorCorrecte = sc.hasNextFloat();
            if (valorCorrecte) {
                num1 = sc.nextFloat();
            } else {
                sc.next();
                System.out.println(MSG_2);
            }
        } while (!valorCorrecte);
        do {
            valorCorrecte = sc.hasNextFloat();
            if (valorCorrecte) {
                num2 = sc.nextFloat();
                System.out.println(MSG_3);
            } else {
                sc.next();
                System.out.println(MSG_2);
            }
        } while (!valorCorrecte);
        do{
            tipus = sc.nextInt();
            switch (tipus) {
                case 0:
                    System.out.println(MSG_8);
                    break;
                case 1:
                    resultat = num1 + num2;
                    System.out.println(MSG_4 + resultat);
                    break;
                case 2:
                    resultat = num1 - num2;
                    System.out.println(MSG_5 + resultat);
                    break;
                case 3:
                    resultat = num1 * num2;
                    System.out.println(MSG_6 + resultat);
                    break;
                case 4:
                    resultat = num1 / num2;
                    System.out.println(MSG_7 + resultat);
                    break;
                default:
                    System.out.println(MSG_2);
                    break;
            }
        }while (!valorCorrecte);
    } 
}


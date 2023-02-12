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

 /*Pre: Demanar un nombre (n) per teclat i validar si aquest és dins el rang [n1,n2], on n1 < n2 
i aquests dos valors també estan introduïts per teclat . L’usuari té 3 intents per a introduir un valor dins d’aquest rang [n1,n2]. 
En cas d’esgotar-los, cal finalitzar el programa. */
public class Exercici_6 {

    private static final String MSG_1 = "Introdueix dos valors el primer mes petit que el segon: ";
    private static final String MSG_2 = "Error en les dades";
    private static final String MSG_3 = "Programa finalitzat.";

    public static void main(String[] args) {
        Exercici_6 method = new Exercici_6();
        float num1 = method.valid6();
    }

    public float valid6() {
        int i = 0;
        boolean exit = false;
        float n1 = 0, n2 = 0, n3 = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        do {
            valorCorrecte = sc.hasNextFloat();
            if (valorCorrecte) {
                n1 = sc.nextFloat();
            } else {
                System.out.println(MSG_2);
            }
        } while (!valorCorrecte);
        do {
            valorCorrecte = sc.hasNextFloat();
            if (valorCorrecte) {
                n2 = sc.nextFloat();
            } else {
                System.out.println(MSG_2);
            }
        } while (!valorCorrecte);
                
        do {
            if (i == 3) {
                System.out.println(MSG_3);
                break;
            } else {
                valorCorrecte = sc.hasNextFloat();
                if (valorCorrecte) {
                    n3 = sc.nextFloat();
                    if (n3 > n1 && n3 < n2) {
                        System.out.println("El número esta entre" + n1 + " i " + n2 + " : " + n3);
                        exit = true;
                    } else {
                        System.out.println(MSG_2);
                        i++;
                    }
                } else {
                    System.out.println(MSG_2);
                    sc.next();
                    i++;
                }
            }
        } while (!valorCorrecte || exit != true);
        return (float) n3;
    }
}

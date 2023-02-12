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

/*Pre: Demanar un nombre per teclat i validar si aquest és un nombre natural. L’usuari té 3 intents.
En cas d’esgotar-los, cal finalitzar el programa. */

public class Exercici_4 {
    private static final String MSG_1 = "Introdueix un número natural: ";
    private static final String MSG_2 = "Error en les dades";
    private static final String MSG_3 = "Programa finalitzat.";

    public static void main(String[] args) {
        Exercici_4 method = new Exercici_4();
        float num1 = method.valid4();
    }
    public int valid4() {
        int i = 0;
        boolean exit = false;
        float num = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        do {
            if (i == 3) {
                System.out.println(MSG_3);
                break;
            } else {
                valorCorrecte = sc.hasNextFloat();
                if (valorCorrecte) {
                    num = sc.nextFloat();
                    if (num > 0) {
                        System.out.println("El número natural es: " + num);
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
        return (int) num;
    }
}

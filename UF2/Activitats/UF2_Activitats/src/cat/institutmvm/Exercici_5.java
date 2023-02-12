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

/*Pre: Demanar un nombre per teclat i validar si aquest és dins el rang [1,10]. 
L’usuari té 3 intents. En cas d’esgotar-los, cal finalitzar el programa. */
public class Exercici_5 {
    private static final String MSG_1 = "Introdueix un número dintre el rang: ";
    private static final String MSG_2 = "Error en les dades";
    private static final String MSG_3 = "Programa finalitzat.";
    private static int MIN = 1;
    private static int MAX = 10;

    public static void main(String[] args) {
        Exercici_5 method = new Exercici_5();
        float num1 = method.valid5();

    }

    public int valid5() {
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
                    if (num > MIN && num < MAX) {
                        System.out.println("El número esta entre 1 i 10: " + num);
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
        } while (exit != true);
        return (int) num;
    }
}

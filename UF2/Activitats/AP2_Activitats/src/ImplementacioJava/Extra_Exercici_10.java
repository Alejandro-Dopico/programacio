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

//Pre: llegirem dos nombres per teclat i sabrem si es multiple i quins son del primer valor.
public class Extra_Exercici_10 {

    private static final String MSG_1 = "Introdueix dos números: ";
    private static final String MSG_2 = "El nombres múltiples de n1 són: ";
    private static final String MSG_3 = "Error, torna ha introduïr: ";
    private static final String MSG_4 = "Error, n1 te que ser menor que n2: ";
    private static final String MSG_5 = "Torna'hi a introduïr: ";

    public static void main(String[] args) {
        boolean valorCorrecte;
        int n1 = 0, n2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        do {
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                while (n1 < 0 || n2 < 0 || n1 >= n2) {
                    System.out.println(MSG_4 + "\n" + MSG_5);
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    sc.next();
                }
            }
            else {
                sc.next();
                System.out.println("\n" + MSG_3);
                }
        } while (!valorCorrecte);
        System.out.println(MSG_2);
        while (n1 <= n2) {
            if (n1 % 2 == 0) {
                System.out.println(n1);
            }
            n1++;
        }
    }
}
//Post: Mostrara els multiples, si es positiu i si no es multiple.
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
public class Exercici_20 {

    private static final String MSG_1 = "Introduce 6 numeros: ";

    public static void main(String[] args) {
        int[] arrayint = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);

        for (int i = 0; i < arrayint.length; i++) {
            arrayint[i] = sc.nextInt();
        }
        System.out.println("\n");
        System.out.println("\nResultat:");
        for (int i = arrayint.length - 1; i >= 0; i--) {
            System.out.print(arrayint[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
import java.lang.Math;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
 */

//Pre: retornem el valor absolute amb el metode d'API de java.
public class Exercici_7 {
    private static final String MSG_1 = "Introdueix un valor: ";
    private static final String MSG_2 = "Aquest es el valor absolut: ";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        int valor = Math.abs(num);
        System.out.println(MSG_2 + valor); 
    }
}

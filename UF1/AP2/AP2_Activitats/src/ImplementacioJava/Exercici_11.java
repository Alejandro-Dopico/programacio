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

public class Exercici_11 {
    private static final String MSG_1 = "Introdueix un nombre: ";

    public static void main(String[] args) {   
        int num, cont = 0, sum= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        
        while(true) {
            if(sum+cont > num){
                break;
            }
            cont++;
            sum += cont;
            System.out.print(cont + ",");

        }
        System.out.println("\nSuma total: " + sum);
}
}
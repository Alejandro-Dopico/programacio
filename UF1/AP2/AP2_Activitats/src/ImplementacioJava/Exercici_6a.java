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

public class Exercici_6a {
    private static final String MSG_1 = "Introdueix un any i un mes: ";
    private static final String MSG_2 = "El mes te 29 dies";
    private static final String MSG_3 = "El mes te 28 dies";
    private static final String MSG_4 = "El mes te 30 dies";
    private static final String MSG_5 = "El mes te 31 dies";
    
    public static void main(String[] args) {
        int any, mes;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        mes = sc.nextInt();
        if (mes % 2 == 0){
            if (mes == 2){
                if (any % 4 == 0){
                    System.out.println(MSG_2);
                }
                else
                    System.out.println(MSG_3);
            }
            else
                System.out.println(MSG_4);
        }
        else {
            System.out.println(MSG_5);
        }
    }
}
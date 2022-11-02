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

//Pre: Introduïm un any i un mes, i amb aquest valors veurem quants dies te el mes
public class Exercici_6b {
    private static final String MSG_1 = "Introdueix un any: ";
    private static final String MSG_2 = "Introdueix un mes: ";

    public static void main(String[] args) {       
        int mes, any, resultatCase;    
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        System.out.println(MSG_2);
        mes = sc.nextInt();
        
        if (mes % 2 == 0){
            if (mes == 2){
                if (any % 4 == 0){
                    resultatCase = 2;
                }
                else
                    resultatCase = 1;
            }
            else
                resultatCase = 3;
        }
        else {
            resultatCase = 4;
        }

        switch (resultatCase) {       
            case 1:
                System.out.println("\n" + "El mes te 28 dies");
                break;
            case 2:
                System.out.println("\n" + "El mes te 29 dias");
                break;
            case 3:
                System.out.println("\n" + "El mes te 30 dias");
                break;
            case 4:
                System.out.println("\n" + "El mes te 31 dias");
                break;
        }
}
}    
//Post: Fent l'estructura Switch, el resultat de la lògica del If-else, dona coma a resultat una variable del switch.
               
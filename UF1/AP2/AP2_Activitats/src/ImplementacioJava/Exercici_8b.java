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

//Pre: Introduïm un nombre i determinem el numero de cops que et demanara els seguents.
public class Exercici_8b {
    private static final String MSG_1 = "Digues quants números vols introduir: ";
    private static final String MSG_2 = "Has d’introduir ";
    private static final String MSG_3 = "Introdueix un número: ";
    private static final String MSG_4 = "Gràcies per utilitzar aquest programa.";
    
    public static void main(String[] args) {   
        int num, quantitat, i= 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        quantitat = sc.nextInt();  
        System.out.println(MSG_2 + quantitat + " numeros");
        num = sc.nextInt();
        System.out.println(MSG_3);
        while(i < quantitat) {
            i++;
            num = sc.nextInt();
            if(quantitat == i){
                break;
            }
            System.out.println(MSG_3);
        }
        System.out.println(MSG_4);
    }
}
//Post: Depenent de la quantitat de nombres introduits printarem el seguents.
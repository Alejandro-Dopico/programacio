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

//Pre: Transformarem polzades en centimetres.
public class Exercici_16 {
    private static final String MSG_1 = "Indrodueix els centimentres: ";
    private static final String MSG_2 = "Error, Torna a introduïr un nombre: ";
    private static final String MSG_3 = "Aquesta es el valor en polzades: ";
    private static final double CONV = 2.54;

    
    public static void main(String[] args){
        double  num1 = 0, resultat = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);  
        do{
            valorCorrecte = sc.hasNextDouble();
            if(valorCorrecte){
                num1 = sc.nextDouble();
            }
            else{
                sc.next();
                System.out.println(MSG_2);
            }
        }while(!valorCorrecte);
        resultat = num1 / CONV;
        System.out.println(MSG_3 + resultat);
    }
}
//Post: Transformem les polzades en centimetres.
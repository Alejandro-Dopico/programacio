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

//Pre: Inroduim tres valors i executem.
public class Exercici_15 {
    private static final String MSG_1 = "Indrodueix tres valors: ";
    private static final String MSG_2 = "Error, Torna a introduïr un nombre: ";
    private static final String MSG_3 = "Aquesta es la suma dels tres valors: ";
    private static final String MSG_4 = "Aquesta es el resultat dels tres valors: ";
    
    public static void main(String[] args){
        int num1 = 0, num2 = 0, num3 = 0, resultat = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);  
        do{
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                num1 = sc.nextInt();
            }
            else{
                sc.next();
                System.out.println(MSG_2);
            }
        }while(!valorCorrecte); 
        do{
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                num2 = sc.nextInt();
            }
            else{
                sc.next();
                System.out.println(MSG_2);
            }
        }while(!valorCorrecte); 
        do{
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                num3 = sc.nextInt();
            }
            else{
                sc.next();
                System.out.println(MSG_2);
            }
        }while(!valorCorrecte); 
        if(num1 == num2 && num1 == num3){
            resultat = num1 + num2 + num3;
            resultat = resultat * 3;
            System.out.println(MSG_4 + resultat);
        }
        else{
            resultat = num1 + num2 + num3;
            System.out.println(MSG_3 + resultat); 
        }
    }
}

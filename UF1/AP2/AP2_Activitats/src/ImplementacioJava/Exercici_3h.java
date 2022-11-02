/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
*/

//Pre: Introduïm un nombre i verifiquem si es par o senar i l'elevem.
import java.util.Scanner;

public class Exercici_3h {
    private static final String MSG_1 = "Introdueix un número: ";
    
    public static void main(String[] args) {
        float num1;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
            if(num1 % 2 == 0){
                System.out.println("Par i elevat al quadrat: " + num1*num1);
            }
            else {
                System.out.println("Senar i elevat al cub: " + num1*num1*num1);
            }           
  }
} 
//Post: Si el nombre es par elevem al quadrat si es senar elevem al cub.
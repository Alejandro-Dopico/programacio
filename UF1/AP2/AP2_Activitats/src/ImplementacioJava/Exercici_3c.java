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

//Pre: Introduïm un nombre i comprovem si entra en el rang demanat.
public class Exercici_3c {
    private static final String MSG_1 = "Introdueix un número: ";
    
    public static void main(String[] args) {
        float num1;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();            
            if(num1 < 100 && num1 > 0){
                System.out.println("El número es positiu i menor que 100");
            }
            else {
                System.out.println("El número no entra en el rang");
            }           
  }
}     
//Post: T'indicarà si és positiu i menor que 100 o el número no entra en el rang.
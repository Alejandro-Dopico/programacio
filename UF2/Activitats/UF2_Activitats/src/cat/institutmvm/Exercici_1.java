/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
 */
///Pre: Crea un programa que demani un nombre per teclat i validi si aquest és natural
public class Exercici_1 {

    private static final String MSG_1 = "Introdueix un número: ";
    private static final String MSG_2 = "El número es negatiu: ";
    private static final String MSG_3 = "El es positiu: ";

    public static void main(String[] args) {
        Exercici_1 method = new Exercici_1();
        float num1 = method.valid();
        
    }
    public int valid() {
        float num=0;
        boolean valorCorrecte; 
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextFloat();
            if (valorCorrecte) {
                num = sc.nextFloat();
                if(num < 0){
                    System.out.println(MSG_2 + num);
                }
                else{
                    System.out.println(MSG_3 + num);
                }
            } else {
                System.out.println(MSG_2);
                sc.next();
            }
        } while (!valorCorrecte);
        return (int) num;
    }
}
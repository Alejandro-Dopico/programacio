/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Exercici_3 {
    private static final String MSG_1 = "Introdueix un número: ";
    private static final String MSG_2 = "El número es positiu i menor que 100: ";
    private static final String MSG_3 = "El número no entra en el rang.";

    public static void main(String[] args) {
        Exercici_3 method = new Exercici_3();
        float num1 = method.valid3();
        
    }
    public int valid3() {
        float num=0;
        boolean valorCorrecte; 
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextFloat();
            if (valorCorrecte) {
                num = sc.nextFloat();
                if(num < 100 && num > 0){
                    System.out.println(MSG_2 + num);
                }
                else{
                    System.out.println(MSG_3);
                }
            } else {
                System.out.println(MSG_2);
                sc.next();
            }
        } while (!valorCorrecte);
        return (int) num;
    }
}
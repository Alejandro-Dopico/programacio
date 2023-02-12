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
public class Exercici_8 {
    private static final String MSG_1 = "Introdueix base: ";
    private static final String MSG_2 = "Introdueix el exponent:  ";
    private static final String MSG_3 = "La potencia és: ";
    
    public static void main(String[] args) {
    double base = 0;
    int exponent = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println(MSG_1); 
    base = sc.nextDouble();
    System.out.println(MSG_2);
    exponent = sc.nextInt();
    System.out.println(MSG_3);
    double result = Math.pow(base, exponent);
    System.out.println(result);
    }
}
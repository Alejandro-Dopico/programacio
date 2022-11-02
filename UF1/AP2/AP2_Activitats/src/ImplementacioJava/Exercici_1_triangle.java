/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacioJava;

/**
 *
 * @author alexd
 */

//Pre: Mostrarem un triangle, amb asterisc.
public class Exercici_1_triangle {
    public static void main(String[] args) {
    int n = 10;
    for (int i=0; i<n; i++) {
            for (int j=n-i; j>1; j--) {
                System.out.print(" ");
            }
              for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
//Post: Hem mostrat per pantalla un traingle equilater


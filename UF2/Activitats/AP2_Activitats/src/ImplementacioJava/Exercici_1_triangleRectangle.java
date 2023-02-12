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
public class Exercici_1_triangleRectangle {
    public static void main(String[] args) {
    String name = "* ";
    for(int i = 0; i < 10; i++) {
        System.out.println(name);
        name= name + "* ";      
    }
  }
}
//Post: Mostra un triangle rectangle.
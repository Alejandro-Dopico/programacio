/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.examples;

import cat.institutmvm.metodosexamples.metodos;

/**
 *
 * @author alexd
 */
public class main {

    public static void main(String[] args) {
        int j = 3;
        //int[] array = new int[10];

        metodos met = new metodos();
        /*
        System.out.println(met.sumaRec(10));

        System.out.println(met.powRec(2, 3));

        System.out.println(met.factorial(4)); 

        for (int n = 0; n <= 20; n++) {
            System.out.println(met.fibonacci(n));
        }
*/
        //met.hanoiTower(j, 'A', 'C', 'B');
        
        

        //System.out.println(met.ex1(10));
        //met.ex2(16);
        //met.ex3(10);  
        //System.out.println(met.ex4(100));
        
             
        int array[] = {10, 20, 30, 40, 50};
        int key = 60;
        int last = array.length - 1;
        int result = met.binarySearch(array, 0, last, key);
        if (result == -1) {
            System.out.println("Element is not found!");
        } else {
            System.out.println("Element is found at index: " + result);
        }
            
        //int canvi = 0;
        /*
        
        for(int i = 0; i < array.length; i++){
            array[i] = met.asc(array, i);
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        */
        //System.out.println(met.power(2,3));
        
    }
}


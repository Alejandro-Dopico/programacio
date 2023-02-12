package cat.institutmvm.utils;

import java.util.Scanner;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
 */
public class Methods {

    public int valorCorrecte(Scanner sc) { 
        /*Validem el número si es númeric. En aquest cas no esta fet amb l'estructura "while",
                                                això es perque en el main esta l'estructura d'errors */
        boolean valorCorrecte;
        int num = -1;

        valorCorrecte = sc.hasNextInt();
        if (valorCorrecte) {
            num = sc.nextInt();
        } else {
            sc.next();
        }
        return num;
    }

    public boolean rang(int num, int min, int max, String texto) { //Metode per validad rangs
        boolean exit = false;

        if (num >= min && num <= max) {
            exit = true;
        } else {
            exit = false;
            System.out.println(texto);
        }
        return exit;
    }

    public int aleatori(int max, int min) { //Metode per generar un número aleatori.   
        int num = 0;

        num = (int) Math.floor(Math.random() * (max - min) + min);
        return num;
    }

    public void swap(int[] arr, int i, int j) { //Mètode per intercanviar els valors de les posicions i.
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void bubbleSortRecursive(int size, int[] change, int[] array1, int[] array2, int[] array3, int[] array4, int[] array5) {
        /* Aquest metode es una variant del bubbleSort pero recursiu,
                                        a més dintre d'aquest fem servir el swap, per intercanviar els valors */
        if (size == 1) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            if (change[i] > change[i + 1]) {
                swap(change, i, i + 1);
                swap(array1, i, i + 1);
                swap(array2, i, i + 1);
                swap(array3, i, i + 1);
                swap(array4, i, i + 1);
                swap(array5, i, i + 1);
            }
        }
        bubbleSortRecursive(size - 1, change, array1, array2, array3, array4, array5);
    }

    public int searchRecursive(int[] array, int search, int first, int last) {
        /*metode per realitzar una busqueda recursiva,
                                                 es una variant del binarySearch*/
        int mid = (first + last) / 2;

        if (last < first || last == first) {
            return 0;
        }
        if (search < array[mid]) {
            return searchRecursive(array, search, first, mid - 1);
        }
        if (search > array[mid]) {
            return searchRecursive(array, search, mid + 1, last);
        }
        if (search == array[mid]) {
            return mid;
        }
        return 0;
    }

    public int[] binarySearch(int[] array, int size) {
        /*Aquet metode buscara si el numero aleatori es repeteix si es així,
                                                     retornara un nou valor, en el cas que no el mateix.*/
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    array[i] = aleatori(0, 5000);
                    return array;
                }
            }
        }
        return array;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.metodosexamples;

/**
 *
 * @author alexd
 */
public class metodos {

    public int sumaRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaRec(n - 1);
        }
    }

    public int powRec(int m, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n == 1) {
                return m;
            } else {
                return m * powRec(m, n - 1);
            }
        }
    }

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int fibonacci(int num) {
        //condició base
        if (num == 0 || num == 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public void hanoiTower(int n, char from_disc, char to_disc, char aux) {
        if (n == 1) {
            System.out.format("Mou el disc 1 des de %c fins a %c\n", from_disc, to_disc);
        } else {
            hanoiTower(n - 1, from_disc, aux, to_disc);
            System.out.format("Mou el disc %d des de %c fins a %c\n", n, from_disc, to_disc);
            hanoiTower(n - 1, aux, to_disc, from_disc);
        }
    }

    public int ex1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + ex1(n - 1);
        }
    }

    public void ex2(int n) {
        if (n == 0) {
        } else {
            ex2(n - 1);
            System.out.println(n);
        }
    }

    public int ex3(int n) {
        if (n == 0) {
            return 1;
        } else {
            System.out.println(n);
            return ex3(n - 1);
        }
    }

    public int ex4(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return 1 + ex4(n / 10);
        }
    }

    public static int binarySearch(int arr[], int first, int last, int key) {
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, first, mid - 1, key);//search in left subarray  
            } else {
                return binarySearch(arr, mid + 1, last, key);//search in right subarray  
            }
        }
        return -1;
    }

    /*
    public int asc(int array[], int i) {
        if (array == 0) {
            return 1;
        } else {
            return array + asc(array - 1);           
        }
    }
     */
    public int power(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            if (exponente == 1) {
                return base;
            } else {
                return base * power(base, exponente - 1);
            }
        }
    }
}

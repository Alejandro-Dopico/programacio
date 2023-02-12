
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

public class LlistaMetodes {

    public int valorCorrecte(Scanner sc) { //Validem el número si es númeric.

        boolean valorCorrecte;
        int num = 0;
        do {
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                num = sc.nextInt();
            } else {
                sc.next();
                System.out.println("Error");
            }
        } while (!valorCorrecte);
        return num;
    }

    public void rang(int n1, int n2) { //Exercici_13
        if (n2 < n1) {
            System.out.println("El segon valor es menor.");
        } else {
            System.out.println("El segon valor es major.");
        }
    }

    public int aleatori(int max, int min) { //Exercici_14
        int num = 0;

        num = (int) Math.floor(Math.random() * (max - min) + min);
        return num;
    }    
    public boolean search(int num1, int num2) {
        boolean comp = false;
        
        if(num1 == num2){
            comp = true;
        }       
        return comp;
    }
    //public bool
}

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
public class Exercici_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix un missatge: ");
        String texto = sc.nextLine();
        String comp = sc.nextLine();
        System.out.println(texto.equals(comp));                
    }
}

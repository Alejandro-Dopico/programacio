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

public class main13 {
    private static final String MSG_1 = "Comprovarem si el segon número introduit es mes petit que el primer";
    private static final String MSG_2 = "Introdueix el primer valor: ";
    private static final String MSG_3 = "Introdueix el segon valor: ";
    
    public static void main(String [] args){
        LlistaMetodes method = new LlistaMetodes(); 
        Scanner sc = new Scanner(System.in);       
        int num1, num2;
        
        System.out.println(MSG_1);
        System.out.println(MSG_2);  
        num1 = method.valorCorrecte(sc);
        System.out.println(MSG_3);
        num2 = method.valorCorrecte(sc);
        method.rang(num1, num2);
        sc.close();
    }
}

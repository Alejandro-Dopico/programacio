
package institutmvm.app;

import institutmvm.utils.methods;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  
*/

public class main {
    
    private static final String MSG_1 = "Que vols fer: \n" + "\nLlegir fitcher(0)" + "\nGuardar text(1)" + "\nAfegir text(2)" + "\nComptar longitud(3)\n";
    private static final String MSG_2 = "Error Torna-hi";

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        methods met = new methods();
       System.out.println("Introdueix el nomb del fitxer: ");
        int opcio = 0, i;
        String fitxer ="";
        String text ="";
        boolean exit = false;
        
        fitxer = sc.nextLine();
        System.out.println(MSG_1);
        File file7 = new File("files/" + fitxer);
        do {
            opcio = met.valorCorrecte(sc);
            switch (opcio) {
                case 0:       
                    exit = met.llegir(fitxer);
                    break;
                case 1:
                    System.out.print("Entra el text: ");
                    exit = met.guardar(fitxer);
                    break;
                case 2:
                    System.out.print("Afageix text: ");
                    exit = met.afegir(fitxer);
                    break;
                case 3:   
                    System.out.println(file7.length() + " caracters.");
                    exit = true;
                    break;
                default:
                    System.out.println(MSG_2);
                    break;
            }
        } while (!exit);
    }
    
}

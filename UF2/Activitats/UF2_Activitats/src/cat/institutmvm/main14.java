
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

public class main14 {

    private static final String MSG_1 = "Comprovarem si el número introduit es troba dintre dels números aleatoris";
    private static final String MSG_2 = "Introdueix un valor: ";
    private static final int SIZE = 10;

    public static void main(String[] args) {

        LlistaMetodes method = new LlistaMetodes();
        Scanner sc = new Scanner(System.in);

        int[] aleatori = new int[SIZE];
        int num1, num2, i;
        boolean comp = false;

        for (i = 0; i < aleatori.length; i++) {
            num2 = method.aleatori(200, 0);
            aleatori[i] = num2;
        }
        System.out.println(MSG_1);
        System.out.println(MSG_2);

        num1 = method.valorCorrecte(sc);

        i = 0;
        while ((!comp) && (i < aleatori.length)) {
            comp = method.search(num1, aleatori[i]);
            i++;
        }
        if (comp) {
            System.out.println("\n" + "El número " + num1 + " esta dintre dels valors.");
        } else {
            System.out.println("\n" + "El número " + num1 + " no esta dintre dels valors.");
        }
        for (i = 0; i < aleatori.length; i++) {
            System.out.print(aleatori[i] + ", ");
        }

        sc.close();
    }
}

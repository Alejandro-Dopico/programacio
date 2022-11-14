/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

///Pre: Emmagatzarem dades per fer un projecte amb un màxim de 3 errors.
public class Sorteig {

    private static final String MSG_1 = "Introdueix el teu ID: ";
    private static final String MSG_2 = "\nIntrodueix la teva edat: ";
    private static final String MSG_3 = "\nQuin tipus de venda es?\n" + "\nVenda lliure (0)" + "\nPensionista (1)" + "\nCarnet Jove (2)" + "\nSoci (3)\n";
    private static final String MSG_4 = "Indica el import de la compra: ";
    private static final String MSG_5 = "Introdueix el número de telefon: ";
    private static final String MSG_6 = "Error en dades";
    private static final String MSG_7 = "Programa finalitzat per error en dades.";
    private static final String MSG_8 = "ID    EDAT  TIPUS   IMPORT   TELÈFON";
    private static final String MSG_20 = "A continuació et demanarem les teves dades i les ompliras per teclat";
    private static final String TYPE_0 = "Lliure";
    private static final String TYPE_1 = "Pension";
    private static final String TYPE_2 = "Carnet";
    private static final String TYPE_3 = "Soci";
    private static final int MAXID = 999;
    private static final int MINID = 111;
    private static final int MAXEDAT = 120;
    private static final int MINEDAT = 14;
    private static final int MAXCOMPRA = 1000;
    private static final int MINCOMPRA = 0;
    private static final int TLF = 9;
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {

        int id = 0, edat = 0, tipus, tlf = 0, res = 0, compra = 0, telefon = 0, i = 0;
        boolean valorCorrecte = false, exit = false;
        String out = "";
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_20);
        do { //Per cada variable, utilitzarem un do/while. Així verificarem si el resultat es correcte
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                id = sc.nextInt();
                if (id >= MINID && id <= MAXID) {
                    exit = true;
                } else {
                    System.out.println(MSG_6);
                    i++;
                }
            } else {
                sc.next();
                System.out.println(MSG_6);
                i++;
            }
            if (i == 3) {
                exit = true;
            }
        } while (exit != true); //Una vegada la i arribi a 3 el resultat sigui correcte, sortirem del bucle.
        if (i == 3) { //Sortirem del bucle si i val 3 el programa finalitzara.
            System.out.println(MSG_7);
        } else { //En el cas contrari continuara el programa a partir d'un "else".
            exit = false;
            i = 0; //Aquí reiniciem la variable i, podriem deixarla tal cual, pero volem tenir 3 intents per cada iteració.
            do { //Repetim amb la mateix estructura les altres variables.
                System.out.println(MSG_2);
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    edat = sc.nextInt();
                    if (edat >= MINEDAT && edat <= MAXEDAT) {
                        exit = true;
                    } else {
                        System.out.println(MSG_6);
                        i++;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_6);
                    i++;
                }
                if (i == 3) {
                    exit = true;
                }
            } while (exit != true);
            if (i == 3) {
                System.out.println(MSG_7);
            } else {

                exit = false;
                System.out.println(MSG_3);
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        tipus = sc.nextInt();
                        switch (tipus) { //Amb el switch case emmagatzarem el resultat de la variable out.

                            case 0:
                                System.out.println("Venda lliure (0)");
                                out = TYPE_0;
                                exit = true;
                                break;
                            case 1:
                                System.out.println("Pensionista (1)");
                                out = TYPE_1;
                                exit = true;
                                break;
                            case 2:
                                System.out.println("Carnet Jove (2)");
                                out = TYPE_2;
                                exit = true;
                                break;
                            case 3:
                                System.out.println("Soci (3)");
                                out = TYPE_3;
                                exit = true;
                                break;
                            default:
                                i++;
                                System.out.println(MSG_6);
                                break;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_6);
                        i++;
                    }
                    if (i == 3) {
                        exit = true;
                    }
                } while (exit != true);
                if (i == 3) {
                    System.out.println(MSG_7);
                } else { //Repetim amb la mateix estructura les altres variables.
                    i = 0;
                    exit = false;
                    System.out.println("\n" + MSG_4);
                    do {
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            compra = sc.nextInt();
                            if (compra >= MINCOMPRA && compra <= MAXCOMPRA) {
                                exit = true;
                            } else {
                                System.out.println(MSG_6);
                                i++;
                            }
                        } else {
                            sc.next();
                            System.out.println(MSG_6);
                            i++;
                        }
                        if (i == 3) {
                            exit = true;
                        }
                    } while (exit != true);
                    if (i == 3) {
                        System.out.println(MSG_7);
                    } else {
                        i = 0;

                        exit = false;
                        do { //Repetim amb la mateix estructura les altres variables, amb un while més.
                            System.out.println("\n" + MSG_5);
                            tlf = 0;
                            res = 0;
                            valorCorrecte = sc.hasNextInt();
                            if (valorCorrecte) {
                                telefon = sc.nextInt();
                                tlf = tlf + telefon;
                                while (telefon != 0) { //Aquí verificarem el número de xifres que te el valor.   
                                    telefon = (telefon / 10); //Dividem entre 10 per saber el número de xifres.
                                    res = res + 1;
                                }
                                if (res == TLF) { //Si el número de xifres es 9, s'emmagatzera.
                                    exit = true;
                                } else {
                                    System.out.println(MSG_6);
                                    i++;
                                }
                            } else {
                                sc.next();
                                System.out.println(MSG_6);
                                i++;
                            }
                            if (i == 3) {
                                exit = true;
                            }
                        } while (exit != true);
                        if (i == 3) {
                            System.out.println(MSG_7);
                        } else { //Printarem els resultats i els valors de color blau.
                            System.out.println("\n" + MSG_8);
                            System.out.println(ANSI_BLUE + id + "   " + edat + "    " + out + "    " + compra + "       " + tlf + ANSI_BLUE);
                        }
                    }
                }
            }
        }
    }
}
//Post: Printarem el resultat emmagatzemat, a més amb color blau. Si hem introduit malament 3 vegadas, el programa es finalitzarà.   
package cat.institutmvm.app;

import cat.institutmvm.utils.Methods;
import java.util.Scanner;

/*  
    Alejandro
    Garcia Dopico
    INS Manuel Vázquez Montalbán
    27/10/22
    Disseny d'Aplicació Web (DAW)
    Programació  

Pre: Emmagatzarem dades per fer un projecte amb un màxim de 3 errors i es preguntara si vols seguir.
Despres s'aura de printar els resultats i si vols seleccionar el tipus. També podras fer una mitjana de les dades.
 */
public class Main {

    private static final String MSG_1 = "Introdueix el ID: ";
    private static final String MSG_2 = "\nIntrodueix la teva edat: ";
    private static final String MSG_3 = "\nQuin tipus de venda es?\n" + "\nVenda lliure (0)" + "\nPensionista (1)" + "\nCarnet Jove (2)" + "\nSoci (3)\n";
    private static final String MSG_4 = "Indica el import de la compra: ";
    private static final String MSG_5 = "Introdueix el número de telefon: ";
    private static final String MSG_6 = "Error en dades";
    private static final String MSG_7 = "Programa finalitzat.";
    private static final String MSG_8 = "ID\tEDAT\tTIPUS\tIMPORT\t TELÈFON\tSORTEIG";
    private static final String MSG_9 = "Continuem amb el seguent registre";
    private static final String MSG_10 = "Vols consultar per tipus de client? (si: 1/ no:0) ";
    private static final String MSG_11 = "Quin tipus de client? ";
    private static final String MSG_12 = "Dades de clients de tipus ";
    private static final String MSG_13 = "\nErrors complerts" + "\nVols introdïr un nou registre? (si: 1/ no:0)";
    private static final String MSG_14 = "Error, introduiex els valors 1 o 0";
    private static final String MSG_15 = "Error, introduiex valors del 0 al 3";
    private static final String MSG_16 = "Vols veure un resum estadístic de les dades? (si: 1/ no:0) ";
    private static final String MSG_17 = "Número de clients introduïts: ";
    private static final String MSG_18 = "Mitjana d’edat: ";
    private static final String MSG_19 = "Número de clients per tipus: ";
    private static final String MSG_20 = "A continuació et demanarem les teves dades i les ompliras per teclat" + "\nIntrodueix el número de clients:";
    private static final String MSG_21 = "Histograma de número de clients per tipus: ";
    private static final String MSG_22 = "No hi han registres per mostrar.";
    private static final String MSG_23 = "Import total acumulat: ";
    private static final String MSG_24 = "Error, introduiex un valor óptim: ";
    private static final String MSG_25 = "A continuació mostrem les dades: ";
    private static final String MSG_26 = "Vols fer el sorteig? (si: 1 / no:0) ";
    private static final int MINID = 111;
    private static final int MAXID = 999;
    private static final int MAXEDAT = 120;
    private static final int MINCOMPRA = 0;
    private static final int MINEDAT = 14;
    private static final int MAXCOMPRA = 1000;
    private static final int MINTLF = 111111111;
    private static final int MAXTLF = 999999999;
    private static final int MINALEATORI = 0;
    private static final int MAXALEATORI = 5000;
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {

        int size = 0, numpersona = 0, resum = 0, sorteig = 0, ultim = 0;
        int error = 0, consultaclient = 0, seguiment = 0, finalitza = 0;
        int lliure = 0, pensio = 0, jove = 0, soci = 0, trobat = 0;
        double mitjana = 0, total = 0;
        boolean exit = false, l = false, p = false, c = false, s = false;
        Scanner sc = new Scanner(System.in);
        Methods method = new Methods();
        System.out.println(MSG_20);

        do {
            size = method.valorCorrecte(sc);
            if (size < 1) {
                System.out.println(MSG_24);
            }
        } while (size < 1);

        int[] arrayId = new int[size];
        int[] arrayEdat = new int[size];
        int[] arrayTipus = new int[size];
        int[] arrayImport = new int[size];
        int[] arrayTlf = new int[size];
        int[] arraySorteig = new int[size];

        do { //Fem un do while perque solament finalitzi si ho demanem per el programa o arriba a la quantitat demanada de clients.
            for (int i = 0; i < size; i++) {
                exit = false;
                seguiment = 3;
                System.out.println(MSG_1);
                error = 0;
                /* Ara amb metodes las comprovacions les farem amb metodes, tant de rang com alphanúmeric.
                El sisteme d'Errors seguira amb l'estructura while.*/
                do {
                    if (error != 3) {
                        arrayId[i] = method.valorCorrecte(sc);
                        exit = method.rang(arrayId[i], MINID, MAXID, MSG_6);
                    }
                    if (error == 3) {
                        exit = true;
                    } else if (!exit) {
                        error++;
                    }
                } while (!exit);
                do {
                    if (error == 3) { //Aquest es el sistema de seguiment, per indicar si vols continuar amb un nou registre     
                        System.out.println(MSG_13);
                        seguiment = method.valorCorrecte(sc);
                        exit = method.rang(seguiment, 0, 1, MSG_14);
                    } else {
                        exit = true;
                    }
                } while (!exit);
                if (error == 3 && seguiment == 0) { //En el cas de no voler continuar finalitzem el bucle i restem numpersona 1 perque es suma sempre.
                    finalitza = 1;
                    numpersona--;
                }
                if (seguiment == 3) {
                    exit = false;
                    error = 0;
                    System.out.println(MSG_2);
                    do {
                        if (error != 3) {
                            arrayEdat[i] = method.valorCorrecte(sc);
                            exit = method.rang(arrayEdat[i], MINEDAT, MAXEDAT, MSG_6);
                        }
                        if (error == 3) {
                            exit = true;
                        } else if (!exit) {
                            error++;
                        }
                    } while (!exit);
                    do {
                        if (error == 3) { //Aquest es el sistema de seguiment, per indicar si vols continuar amb un nou registre     
                            System.out.println(MSG_13);
                            seguiment = method.valorCorrecte(sc);
                            exit = method.rang(seguiment, 0, 1, MSG_14);
                        } else {
                            exit = true;
                        }
                    } while (!exit);
                    if (error == 3 && seguiment == 0) {
                        finalitza = 1;
                        numpersona--;
                    }
                    if (seguiment == 3) { //Aquí en el cas de que volguem seguir trenquem la cadena per tornar a dalt.
                        error = 0;
                        exit = false;
                        System.out.println(MSG_3);
                        do {
                            if (error != 3) {
                                arrayTipus[i] = method.valorCorrecte(sc);
                                switch (arrayTipus[i]) { //Amb el switch case emmagatzarem el resultat del tipus.

                                    case 0:
                                        System.out.println("Venda lliure (0)");
                                        exit = true;
                                        break;
                                    case 1:
                                        System.out.println("Pensionista (1)");
                                        exit = true;
                                        break;
                                    case 2:
                                        System.out.println("Carnet Jove (2)");
                                        exit = true;
                                        break;
                                    case 3:
                                        System.out.println("Soci (3)");
                                        exit = true;
                                        break;
                                    default:
                                        System.out.println(MSG_6);
                                        break;
                                }
                            }
                            if (error == 3) {
                                exit = true;
                            } else if (!exit) {
                                error++;
                            }
                        } while (!exit);
                        do {
                            if (error == 3) { //Aquest es el sistema de seguiment, per indicar si vols continuar amb un nou registre     
                                System.out.println(MSG_13);
                                seguiment = method.valorCorrecte(sc);
                                exit = method.rang(seguiment, 0, 1, MSG_14);
                            } else {
                                exit = true;
                            }
                        } while (!exit);
                        if (error == 3 && seguiment == 0) {
                            finalitza = 1;
                            numpersona--;
                        }
                        if (seguiment == 3) {
                            error = 0;
                            exit = false;
                            System.out.println("\n" + MSG_4);
                            do {
                                if (error != 3) {
                                    arrayImport[i] = method.valorCorrecte(sc);
                                    exit = method.rang(arrayImport[i], MINCOMPRA, MAXCOMPRA, MSG_6);
                                }
                                if (error == 3) {
                                    exit = true;
                                } else if (!exit) {
                                    error++;
                                }
                            } while (!exit);
                            do {
                                if (error == 3) { //Aquest es el sistema de seguiment, per indicar si vols continuar amb un nou registre     
                                    System.out.println(MSG_13);
                                    seguiment = method.valorCorrecte(sc);
                                    exit = method.rang(seguiment, 0, 1, MSG_14);
                                } else {
                                    exit = true;
                                }
                            } while (!exit);
                            if (error == 3 && seguiment == 0) {
                                finalitza = 1;
                                numpersona--;
                            }
                            if (seguiment == 3) {
                                error = 0;
                                System.out.println("\n" + MSG_5);
                                exit = false;
                                do {
                                    if (error != 3) {
                                        arrayTlf[i] = method.valorCorrecte(sc);
                                        exit = method.rang(arrayTlf[i], MINTLF, MAXTLF, MSG_6);
                                    }
                                    if (error == 3) {
                                        exit = true;
                                    } else if (!exit) {
                                        error++;
                                    }
                                } while (!exit);
                                do {
                                    if (error == 3) { //Aquest es el sistema de seguiment, per indicar si vols continuar amb un nou registre     
                                        System.out.println(MSG_13);
                                        seguiment = method.valorCorrecte(sc);
                                        exit = method.rang(seguiment, 0, 1, MSG_14);
                                    } else {
                                        exit = true;
                                    }
                                } while (!exit);
                                if (error == 3 && seguiment == 0) {
                                    finalitza = 1;
                                    numpersona--;
                                }
                                /*Aquí generem un número aleatori i l'asignem a un client,
                                També comprovarem si aquest es repeteix en altres clients utilitzant BinarySearch*/
                                if (seguiment == 3) {
                                    arraySorteig[i] = method.aleatori(MAXALEATORI, MINALEATORI); 
                                    arraySorteig = method.binarySearch(arraySorteig, size); 
                                }
                            }
                        }
                    }
                }
                if (seguiment == 1 && size == 1) { //Si volem seguir i size es 1 printem per continuar.
                    System.out.println("\n" + MSG_9);
                } else {
                    numpersona++;
                    if (numpersona < size && finalitza == 0) { //Aquí comprovem si el numpersona es mes petit que size per continuar.
                        System.out.println("\n" + MSG_9);
                    }
                }
                if (error == 3) { // Aquí restem i numpersona, per poder seguir amb el mateix registre i no el seguent.
                    if (i != 0 && finalitza == 0) {
                        i--;
                        numpersona--;
                    }
                }
                if (finalitza == 1) { //Trenquem el bucle for perque volem finalitza.
                    i = 100;
                }
            }
            if (numpersona == size) { // si arribem al maxim de personas que pot tenir el size, finalitza.
                finalitza = 1;
            }
        } while (finalitza == 0);
        if (seguiment == 0 && size == 1) {
        } else { // Aquí mostrarem les dades tenint en compte si les dades han siguit introduides correctament.
            System.out.println("\n" + MSG_25 + "\n" + "\n" + MSG_8);
            for (int i = 0; i < size; i++) {
                if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                    System.out.print(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + ANSI_BLUE);
                    switch (arrayTipus[i]) { //En aquet switch emmagatzarem les vegades d'un tipus que hi ha i si existeix emmagatzemat.

                        case 0:
                            System.out.print(ANSI_BLUE + "Lliure" + ANSI_BLUE);
                            lliure++;
                            l = true;
                            break;
                        case 1:
                            System.out.print(ANSI_BLUE + "Pensio" + ANSI_BLUE);
                            pensio++;
                            p = true;
                            break;
                        case 2:
                            System.out.print(ANSI_BLUE + "Jove" + ANSI_BLUE);
                            jove++;
                            c = true;
                            break;
                        case 3:
                            System.out.print(ANSI_BLUE + "Soci" + ANSI_BLUE);
                            soci++;
                            s = true;
                            break;
                    }
                    System.out.print("\t" + ANSI_BLUE + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySorteig[i] + ANSI_BLUE + "\n");
                }
            }
            System.out.println("\n" + "S'han introduït " + numpersona + " registres de clients.\n"); // printarem la quantitat de clients fent servir la variable numpersona.
            System.out.print(MSG_10);
            exit = false;
            do {
                consultaclient = method.valorCorrecte(sc); //Aquest es el sistema per fer la consulta. 
                exit = method.rang(consultaclient, 0, 1, MSG_14);
            } while (!exit);
            if (consultaclient == 1) {
                System.out.print(MSG_11);
                exit = false;
                do {
                    consultaclient = method.valorCorrecte(sc);
                    for (int i = 0; i < size; i++) {
                        switch (consultaclient) { //Amb el switch case printarem la consulta client seleccionada.

                            case 0:
                                System.out.println(MSG_12 + ANSI_BLUE + "Venda Lliure:" + ANSI_BLUE);
                                exit = true;
                                break;
                            case 1:
                                System.out.println(MSG_12 + ANSI_BLUE + "Pensionista:" + ANSI_BLUE);
                                exit = true;
                                break;
                            case 2:
                                System.out.println(MSG_12 + ANSI_BLUE + "Carnet Jove:" + ANSI_BLUE);
                                exit = true;
                                break;
                            case 3:
                                System.out.println(MSG_12 + ANSI_BLUE + "Soci:" + ANSI_BLUE);
                                exit = true;
                                break;
                            default:
                                error++;
                                System.out.println(MSG_15);
                                break;
                        }
                        i = 100;
                    }
                } while (!exit);
                
                /* Aquí fem la reordenacio recursiva respecte al primer Array que enviem, aquest cas el d'Edat */
                method.bubbleSortRecursive(size, arrayEdat, arrayId, arrayTipus, arrayImport, arrayTlf, arraySorteig);
                
                for (int i = 0; i < size; i++) { //Aquí comprobem si el tipus seleccionat esta emmagatzemat o no.
                    if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                        if (arrayTipus[i] == consultaclient) {
                            System.out.println(MSG_8);
                            i = 100;
                        } else if (arrayTipus[i] != consultaclient) {
                            System.out.println(MSG_22);
                            i = 100;
                        }
                    }
                }
                for (int i = 0; i < size; i++) { //Aquí printarem nomes els tipus seleccionat a la consulta.
                    if (arrayTipus[i] == consultaclient) {
                        if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                            switch (arrayTipus[i]) {

                                case 0:
                                    System.out.println(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + "Lliure" + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySorteig[i] + ANSI_BLUE);
                                    break;
                                case 1:
                                    System.out.println(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + "Pensio" + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySorteig[i] + ANSI_BLUE);
                                    break;
                                case 2:
                                    System.out.println(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + "Jove" + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySorteig[i] + ANSI_BLUE);
                                    break;
                                case 3:
                                    System.out.println(ANSI_BLUE + arrayId[i] + "\t" + arrayEdat[i] + "\t" + "Soci" + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySorteig[i] + ANSI_BLUE);
                                    break;
                            }
                        }
                    }
                }
            }
            exit = false;
            System.out.print("\n" + MSG_16 + "\n"); // Aquí preguntarem si volem fer un resum estadístic.
            do {
                resum = method.valorCorrecte(sc); //Aquest es el sistema per fer la consulta. 
                exit = method.rang(resum, 0, 1, MSG_14);
            } while (!exit);
            if (resum == 1) {
                System.out.println(MSG_17 + size);
                for (int i = 0; i < size; i++) {
                    mitjana = mitjana + arrayEdat[i]; //Fem la mitjana sumant totes les edats i dividint per la quantitat de clients.
                }
                System.out.println(MSG_18 + mitjana / size + " anys");
                System.out.println(MSG_19 + "\n"); 
                /* Amb el sistema boolea detectem quins dels tipus han sigut emmagatzemant. 
                                                    Els booleans són les inicials del tipus per cadascun */
                if (l == true) {
                    System.out.println("Lliure: " + lliure);
                }
                if (p == true) {
                    System.out.println("Pensio: " + pensio);
                }
                if (c == true) {
                    System.out.println("Jove: " + jove);
                }
                if (s == true) {
                    System.out.println("Soci: " + soci);
                }
                System.out.println("\n" + MSG_21);
                System.out.println("-----------------------------");
                if (lliure != 0) {
                    System.out.print("Lliure: "); //Printem el histograma fent servir les variables del switch case anterior.
                    for (int i = 0; i < lliure; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (pensio != 0) {
                    System.out.print("Pensio: ");
                    for (int i = 0; i < pensio; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (jove != 0) {
                    System.out.print("Jove: ");
                    for (int i = 0; i < jove; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (soci != 0) {
                    System.out.print("Soci: ");
                    for (int i = 0; i < soci; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (int i = 0; i < size; i++) {
                    total = total + arrayImport[i]; //Sumem el import de tots els clients i els dividim per la seva quantitat.
                }
                System.out.println("\n" + MSG_23 + total);
            }
            System.out.println("\n" + MSG_26);
            do {
                sorteig = method.valorCorrecte(sc); //Aquest es el sistema per fer la consulta. 
                exit = method.rang(sorteig, 0, 1, MSG_14);
            } while (!exit);
            
            /* Aquí tanquem el fluxe del Scanner, 
                no hi han mes dades a introduir per teclat */
            
            sc.close();
            exit = false;
            
            /* A continuació generem el número aleatori guanyador, 
                també comprovarem si algú a guanyat amb el metode SearchRecursive
                Si algú ha guanyat printara l'ID del client */
            
            if (sorteig == 1) { 
                sorteig = method.aleatori(MAXALEATORI, MINALEATORI);
                System.out.println("El número premiat és el " + sorteig);
                method.bubbleSortRecursive(size, arraySorteig, arrayId, arrayTipus, arrayImport, arrayTlf, arrayEdat);
                ultim = size - 1;
                trobat = method.searchRecursive(arraySorteig, sorteig, 0, ultim);
                if (arraySorteig[trobat] == sorteig) {
                    System.out.println("Ha estat premiat el client amb Id " + arrayId[trobat]);
                } else {
                    System.out.println("No hi ha cap client premiat.");
                }
            }
        }
        if (seguiment == 0 && size == 1) {
            System.out.print("\n" + MSG_22); //Aquí es si hem posat un client i no hem volgut continuar. No hi ha registres per mostrar.
        }
        System.out.println("\n" + MSG_7); //Printem que ha finalitzat el programa.
    }
}
/*
Post: Printarem el resultat emmagatzemat. Es tindra en compte les multiples posibilitats d'entrada d'errors.
No es bloquejara en ningun punt. Potser no es optimitzat per lineas, pero no falla en cap punt.
 */

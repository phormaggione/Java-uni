/*
Scrivere un programma in linguaggio Java che legga da tastiera
un numero binario puro sotto forma di una stringa di caratter∏i (0 o 1)
lunga al massimo 8 bit e la passi ad una funzione che restituisca
l'equivalente valore in decimale. Per il calcolo della potenza di un numero
si usi il metodo Math.pow(double a, double b) che restituisce a elevato alla potenza b.
*/

//controlli non obbligatori

import java.util.Scanner;

    public class BinToDec {
    public static void main(String[] args) throws Exception {
            boolean controllo;
            Scanner input = new Scanner(System.in);
            String bin;

            do {
                controllo = true;
                System.out.println("Inserisci la stringa binaria di massimo 8 caratteri:");
                bin = input.nextLine();

                if (bin.length() > 8) {
                    System.out.println("Stringa troppo lunga");
                    controllo = false;
                }
                else {
                    for (int i = 0; i <bin.length(); i++) {
                        if (bin.charAt(i) != '1' && bin.charAt(i) != '0') {
                            System.out.println("Stringa non binaria");
                            controllo = false;
                            break;
                        }
                    }
                }
            }while (controllo == false);
            input.close();
            System.out.println("Il numero decimale è: " +binToDec(bin));
    }

    public static double binToDec(String bin) {
        double dec = 0;
        short esponente = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {  //le stringhe si leggono da sx verso dx, i numeri binari da dx verso sx
            if (bin.charAt(i) == '1')
                dec = dec + Math.pow(2, esponente);
        esponente++; //l'indice del for non corrisponde quindi alla potenza binaria da elevare, quindi serve una questa var
        }
        return dec;
    }
}


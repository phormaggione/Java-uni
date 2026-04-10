/*
Scrivere un programma in linguaggio Java che legga da tastiera
un numero binario puro sotto forma di una stringa di caratter∏i (0 o 1)
lunga al massimo 8 bit e la passi ad una funzione che restituisca
l'equivalente valore in decimale. Per il calcolo della potenza di un numero
si usi il metodo Math.pow(double a, double b) che restituisce a elevato alla potenza b.
*/

//no controlli a quanto pare
//DA FINIRE

import java.util.Scanner;

    public class BinToDec {
    public static void main(String[] args) throws Exception {
            System.out.println("Inserisci la stringa binaria di massimo 8 caratteri:");
            Scanner input = new Scanner(System.in);
            String bin = input.nextLine();
            System.out.println("Hai inserito la stringa" + bin);
            input.close();

            int numDec = binToDec(bin);
            System.out.println("Conversione in decimale: "+numDec);
    }

    public static int binToDec(String bin) {
        double dec = 0;
        for (int i =0; i<bin.length(); i++) {
            if (bin.charAt(i) == 1) { 
                double potenzaDue = Math.pow(2, i);
                dec = dec + potenzaDue;
            }
        }
        return dec;
    }
}


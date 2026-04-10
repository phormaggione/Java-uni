/*
/*Scrivi un programma in linguaggio Java che legga da tastiera
una frase e una parola; queste devono essere passate ad un metodo statico che restituisce
il numero di occorrenze della parola nella frase.
*/

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        System.out.println("Inserisci una frase:");
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        System.out.println("Hai inserito la frase: "+frase);

        System.out.println("Inserisci una parola:");
        String parola = input.nextLine();    
        System.out.println("Hai inserito la parola: "+parola);
        input.close();

        System.out.println("Il numero di occorrenze è: " +CountOccorrenze(parola, frase));
    }

    public static int CountOccorrenze(String parola, String frase) {
        /*
        devo spezzare la frase in parole, lo faccio usando lo spazio
        come limitatore e uso indexof per trovare quando finisce una parola, e copio
        in tempParola usando getchars, che poi confronto con la stringa parola
        */
        int occorrenze = 0;
        int inizioParola = 0;
        int fineParola = 0;
        do{
            fineParola =frase.indexOf(" ", inizioParola);
            if (fineParola == -1)
                fineParola = frase.length(); //se non ci sono più spazi siamo a fine frase
            
            char[] tempCaratteri = new char[fineParola-inizioParola]; //array caratteri della paroal da cercare
            frase.getChars(inizioParola, fineParola , tempCaratteri, 0);
            String tempParola = new String(tempCaratteri); //converto array di char in stringa sennò non va l'equals
            
            if (tempParola.equals(parola)) 
                occorrenze++;

            inizioParola = fineParola +1; 
        }while(fineParola != frase.length());
        
        return occorrenze;
     }
}



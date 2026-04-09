import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) throws Exception {
    System.out.println("Inserisci una frase:");
    Scanner input = new Scanner(System.in);
    String frase = input.nextLine();
    System.out.println("Hai inserito la frase: "+frase);
    System.out.println("Inserisci una parola:");
    String parola = input.nextLine();    
    System.out.println("Hai inserito la parola: "+parola);
    System.out.println("Il numero di occorrenze è: " +CountOccorrenze(parola, frase));
    input.close();
    }

    public static int CountOccorrenze(String parola, String frase) {
        int occorrenze = 0;


        return occorrenze;
    }
}



/*
Scrivi un programma che legga da tastiera una frase e una parola, queste devono essere passate
ad un metodo statico che restituisce il numero di occorrenze della parola nella frase
*/
import matematica.GetFattoriale;
import java.util.Scanner;

public class Chiamante {
    public static void main(String[] args) {
        int n;
        long ris;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");
        n = input.nextInt();
        ris = GetFattoriale.getFattoriale(n);

        if (ris != -1) {
            System.out.println("Il fattoriale è: " + ris);
        } 
        else  {
            System.out.println("Hai inserito un numero negativo!");
        }
        input.close();
    }
}

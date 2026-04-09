import java.util.Scanner;

public class Vettori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //si può fare anche [MAX_DIM] prima col vettore e poi chiedere il riempimento
        System.out.println("Inserire la dimensione del vettore: ");
        int vector[] = new int[input.nextInt()];

        for(int i = 0; i<vector.length; i++) {
            System.out.println("Inserire l'elemeneto n" + i);
            vector[i] = input.nextInt();
        }
        
        for(int i : vector) {
            System.out.println("\t" + i);
        }
        
        System.out.println("-----COPIA + VALORE IN CODA-----");
        System.out.println("Inserire il numero da mettere alla fine del vettore: ");
        int value = input.nextInt();
        int new_vector[] = new int[vector.length+1];

        for (int i = 0; i<vector.length; i++) {
            new_vector[i] = vector[i];
        }
        new_vector[vector.length] = value;
        for(int i : new_vector) {
            System.out.println("\t" + i);
        }
        input.close();
    }
}

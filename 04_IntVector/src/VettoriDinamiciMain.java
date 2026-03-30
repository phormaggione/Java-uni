import java.util.Scanner;

public class VettoriDinamiciMain{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la dimensione del vettore:");
        int dim = input.nextInt();
        IntVector v = new IntVector(dim);
        for (int i = 0; i<dim; i++) {
            v.set(i, input.nextInt());
        }
        input.close();
        for (int i = 0; i<dim; i++) {
            System.out.println("\t" + v.get(i));
        }
        
    }
}
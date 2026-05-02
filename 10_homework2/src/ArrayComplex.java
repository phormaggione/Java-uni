import java.util.Scanner;

public class ArrayComplex {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci la dimensione:");
        int dim = input.nextInt();

        Complex[] vector = new Complex[dim];
        InsertComplexFromTerminal(vector, dim, input);
        
        int scelta;
        do {

            PrintMenu();
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    PrintAll(vector, dim);
                    break;
                case 2:
                    PrintAllModules(vector, dim);
                    break;
                case 3:
                    BubbleSort(vector, dim);
                    break;
                case 4:
                    System.out.println("Inserisci la parte reale del numero da cercare: ");
                    double Re = input.nextDouble();
                    System.out.println("Inserisci la parte immaginaria del numero da cercare: ");
                    double Imm = input.nextDouble();
                    Complex e = new Complex(Re, Imm);
                    int[] pos = new int[1];
                    boolean trovato = Search(vector, dim, e, pos);
                    if (trovato)
                        System.out.println("Elemento trovato in posizione" +pos[0] + "\n");
                    else
                        System.out.println("Elemento non trovato\n");
                    break;
                case 0:
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Scelta non valida!\n");
                    break;
            }
        } while (scelta != 0);

        input.close();

    }

    public static void InsertComplexFromTerminal(Complex[] array, int DIM, Scanner input) {
        for (int i = 0; i < DIM; i++) {
            System.out.println("Inserire la parte reale del numero complesso n" +i);
            double tempRe = input.nextDouble();
            System.out.println("Inserire la parte immaginaria del numero complesso n" +i);
            double tempImm = input.nextDouble();
            array[i] = new Complex(tempRe,tempImm);
        }
    }

    public static void PrintAll(Complex[] array, int DIM) {
        for(int i = 0; i< DIM; i++) 
            array[i].stampa();            
    }

    public static void BubbleSort(Complex[] array, int DIM) {
        for(int i = 0; i < DIM -1 ; i++) 
            for (int j = 0; j < DIM - i - 1; j++) 
                if (array[j].moduloComplex() > array[j+1].moduloComplex()) {
                    //non serve fare Complex temp = new Complex(array[j]), lo scambio di riferimenti funziona uguale
                    Complex temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }

    public static boolean Search(Complex[] array, int DIM, Complex e, int[] pos) {
        for(int i = 0; i < DIM ; i++) 
            if (array[i].getRe() == e.getRe() && array[i].getImm() == e.getImm())
                return true;      
        return false;
    }

    public static void PrintAllModules(Complex[] array, int DIM) {
        for(int i = 0; i < DIM; i++) 
            System.out.println("Modulo n " +i +" " +array[i].moduloComplex());
    }

    public static void PrintMenu() {
        System.out.println("\nOperazioni possibili sul vettore:\n");
        System.out.println("1. Stampa tutti i numeri");
        System.out.println("2. Stampa tutti i moduli");
        System.out.println("3. Ordina il vettore (Bubble Sort)");
        System.out.println("4. Cerca un numero complesso");
        System.out.println("0. Esci");
        System.out.print("Scegli un'operazione: ");        
    }


}

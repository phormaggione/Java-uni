import java.util.Scanner;

public class ArrayComplex {
    public static void main(String[] args) throws Exception {

        Scanner lettore = new Scanner(System.in);
        
        System.out.println("Inserisci la dimensione:");
        int dim = lettore.nextInt();

        Complex[] vector = new Complex[dim];
        InsertComplexFromTerminal(vector, dim);

        lettore.close();

        PrintMenu();

    }

    public static void InsertComplexFromTerminal(Complex[] array, int DIM) {
        double tempRe;
        double tempImm;
        for (int i = 0; i < DIM; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Inserire la parte reale del numero complesso n" +i);
            tempRe = input.nextDouble();
            System.out.println("Inserire la parte immaginaria del numero complesso n" +i);
            tempImm = input.nextDouble();
            array[i] = new Complex(tempRe,tempImm);
            input.close();
        }
    }

            public static void PrintAll(Complex[] array, int DIM) {

    }

            public static void BubbleSort(Complex[] array, int DIM) {

    }

            public static boolean Search(Complex[] array, int DIM, Complex e, int[] pos) {
        return false;
    }

            public static void PrintAllModules(Complex[] array, int DIM) {

    }

            public static void PrintMenu() {
        
    }

}

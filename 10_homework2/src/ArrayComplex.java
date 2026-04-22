import java.util.Scanner;

public class ArrayComplex {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci la dimensione:");
        int dim = input.nextInt();

        Complex[] vector = new Complex[dim];
        InsertComplexFromTerminal(vector, dim, input);

        PrintMenu();
        
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

    }

    public static boolean Search(Complex[] array, int DIM, Complex e, int[] pos) {
        for(int i = 0; i < dim ; i++) {
            if (array[i].getRe() == e.getRe() && array[i].getImm() == e.getImm())
                return true;      
        return false;
    }

    public static void PrintAllModules(Complex[] array, int DIM) {
        for(int i = 0; i < DIM; i++) 
            System.out.println("Modulo n " +i +" " +array[i].moduloComplex());
    }

    public static void PrintMenu() {
                
    }


}

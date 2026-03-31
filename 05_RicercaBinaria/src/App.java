import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ElementNotFound {
        int vect[] = {3, 5 , 6, 7};
        Scanner input = new Scanner(System.in);
        System.out.print("inserisci il numero da cercare: ");
        int elem = input.nextInt();
        System.out.println("elem");
        try {
            int pos = binarySearch(vect, 0, vect.length, elem);
            System.out.println("elemento trovato in posizione: " + pos);
        } catch (ElementNotFound e) {
            System.out.println("elemento non trovato");
        }
        input.close();
    }


    public static int binarySearch(int[] vect, int start, int end, int elem) {

        int meta = (start + end)/2; //implementazione ricorsiva, senza while, prima caso base = condizione di arresto

        if (start > end) {

            return -1;//hrow new ElementNotFound();

        }

        else {

            if(vect[meta] == elem) {

                return meta;

            }

            if(vect[meta] > elem) {

                return binarySearch(vect, start, meta-1, elem);

            }

            if(vect[meta] < elem) {

                return binarySearch(vect, meta+1, end, elem);

            }

        }

    }

}



class ElementNotFound extends Exception {
}



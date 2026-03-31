/*
public class BinarySearch {
 vect vettore su cui effettuare
start primo indice del vettore
end ultimo indice
nel main definire un vettore statico, input da cercare, ciclo for
ciclo for

try {
    int elem = input.nextInt();
    }







    public static int binarySearch(int[] vect, int start, int end, int elem) throws ElementNotFound {
        int meta = (start + end)/2; //implementazione ricorsiva, senza while, prima caso base = condizione di arresto
        if (start > end) {
            throw new ElementNotFound();
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
 

*/
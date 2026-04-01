import java.util.Scanner;

public class TestCerchio {
    public static void main(String[] args) {
        Cerchio[] vector = new Cerchio[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Inserisci il raggio del cerchio in pos " +i);
            vector[i] = new Cerchio(input.nextDouble());
        }
        input.close();
        for (int i = 0; i < vector.length; i++) {System.out.println("Perimetro cerchio n"+i+": "+vector[i].perimetro());}
    }
}



/*
Esercizio: Classe Cerchio
Scrivere una classe Cerchio che rappresenta un cerchio nel piano cartesiano.
Requisiti della classe Cerchio:
• La classe deve avere tre attributi privati:
o double x → coordinata x del centro
o double y → coordinata y del centro
o double raggio → raggio del cerchio
• Deve avere metodi get e set pubblici per tutti e tre gli attributi.
(Nota: per questo esercizio, non è necessario controllare se il raggio è negativo.)
• Deve avere:
o un costruttore che riceve un parametro raggio e imposta x e y a zero (origine degli 
assi).
o un metodo pubblico area() che restituisce l’area del cerchio (formula: π * r²)
o un metodo pubblico perimetro() che restituisce il perimetro del cerchio (formula: 
2 * π * r)
Classe di test TestCerchio
Scrivere una classe TestCerchio con un metodo main che:
1. Crea un array di 5 oggetti Cerchio.
2. Chiede all’utente di inserire i raggi per ognuno dei 5 cerchi usando Scanner.
3. Per ogni raggio inserito, crea un oggetto Cerchio usando il costruttore e lo inserisce 
nell’array.
4. Alla fine, stampa a video il perimetro di ciascun cerchio.
Suggerimenti
• Ricordati di importare java.util.Scanner nella classe di test.
• Usa Math.PI per ottenere il valore di π.

*/
public class TestComplex  {
    public static void main(String[] args) throws Exception {
        Complex C1 = new Complex();
        Complex C2  = new Complex(10, -20);
        Complex C3 = new Complex(C2);

        System.out.printf("Stampa complessi\nC1: ");
        C1.stampa();
        System.out.printf("C2: ");
        C2.stampa();
        System.out.printf("C3: ");
        C3.stampa();

        C3.setRe(-20);
        C3.setImm(25);
        System.out.printf("\nC3 dopo i set: ");
        C3.stampa();

        System.out.println("\nModuli\nC1: " + C1.moduloComplex() + "\nC2: " + C2.moduloComplex() + "\nC3: " + C3.moduloComplex());

        Complex C4 = C2.sommaComplex(C3);
        System.out.printf("\nSomma C2 + C3: ");
        C4.stampa();
        Complex C5 = C3.sommaComplex(C1);
        System.out.printf("\nSomma C3 + C1: ");
        C5.stampa();

        Complex C6 = C2.prodottoComplex(C3);
        System.out.printf("\nProdotto C2 * C3: ");
        C6.stampa();
        Complex C7 = C3.prodottoComplex(C1);
        System.out.printf("\nProdotto C3 * C1: ");
        C7.stampa();
    }
}

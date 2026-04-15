public class Complex {
    private double Re;
    private double Imm;

    public Complex() {
        this.Re = 0;
        this.Imm = 0;
    }

    public Complex(double Re, double Imm) {
        this.Re = Re;
        this.Imm = Imm;
    }

    public Complex(Complex C) {
        this.Re = C.Re;
        this.Imm = C.Imm;
    }

    public double getRe() {return this.Re;}
    public double getImm() {return this.Imm;}

    public void setRe(double Re) {this.Re = Re;}
    public void setImm(double Imm) {this.Imm = Imm;}
    
    public void stampa() {
        if (this.Imm >= 0)
            System.out.println(this.Re +" +" +this.Imm +"i");
        else
            System.out.println(this.Re +" " +this.Imm +"i");
    }

    public double moduloComplex() {
        return Math.sqrt(this.Re * this.Re + this.Imm * this.Imm); // formula del modulo: (Re^2 + Imm^2)^1/2
    }

    public Complex sommaComplex(Complex OP) {
        return new Complex(this.Re + OP.Re , this.Imm + OP.Imm);   //ovviamnete bisogna creare un nuovo oggetto per poterlo passare e usiamo costruttore con parametri
    }                                                              //non servono get e set per accedere a Re ed Imm perchè oggetti della stessa classe

    public Complex prodottoComplex(Complex OP) {
        /*
        il prodotto fra due numeri complessi z1 = a + ib e z2= c + id
        è (ac - bd) + i(ad + bc)

        faccio delle var temporanee per calcolare la nuova Re e Imm
        per non fare uno schifo lungo nel return
        */
        double newRe = (this.Re * OP.Re) - (this.Imm * OP.Imm);
        double newImm = (this.Re * OP.Imm) + (this.Imm * OP.Re);

        return new Complex(newRe, newImm);
    }
    
}

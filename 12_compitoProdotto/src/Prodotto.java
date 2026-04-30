import java.util.Objects;
public class Prodotto {
    
    protected int quantità;
    protected float costoBase;
    private String nomeProdotto;
    private StringBuilder codice;

    public Prodotto() {
        super();
        this.quantità = 0;
        this.costoBase = 0.0f;
        this.nomeProdotto = "*****";
        this.codice = new StringBuilder("A000");
    }

    public Prodotto(int quantità, float costoBase, String nomeProdotto, String codice ) {
        this.quantità = quantità;
        this.costoBase = costoBase;
        this.nomeProdotto = nomeProdotto;
        this.codice = new StringBuilder(codice);
        this.codice.ensureCapacity(20);
    }
    
    public Prodotto(Prodotto p) {
        this.quantità = p.quantità;
        this.costoBase = p.costoBase;
        this.nomeProdotto = p.getNomeProdotto();
        this.codice = new StringBuilder(p.getCodice());
        this.codice.ensureCapacity(20);
    }
    
    public String getNomeProdotto() {return this.nomeProdotto;}
    public String getCodice() {return this.codice.toString();}
    public void setCodice(String pCodice) {
        //replace o append questo è sbagliato this.codice = new StringBuilder(pCodice);}
    }
    @Override                               //da mettere gli altri attributi
    public String toString() {return  "quantita: " +this.quantità +"\ncosto base: " + this.costoBase + "\nnome prodotto: " +this.nomeProdotto +"\ncodice: " +this.codice.toString();}
 
    //due prodotti sono uguali se hanno stesso codice e nome, quantità e costo base no
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        final Prodotto other = (Prodotto) obj;
        return this.nomeProdotto.equals(other.nomeProdotto) && this.codice.toString().equals(other.codice.toString());                                                          
        //essendo stringbuilder una classe di java e non nostra, invece di reimplementare un'altra equals di strngbuilder usiamo tostring siccome le string hanno metodo equals
    }

    //due oggetti diversi potrebbero dare lo stesso hash code, collissione
    //due oggeti uguali -> hash code uguali, due hash code uguali != oggetti uguali
    @Override
    public int hashCode() {
        return Objects.hash(this.nomeProdotto, this.codice.toString());
    }

    public float calcoloCosto() {return this.costoBase*this.quantità;}

    public boolean checkCodice() {
        boolean corretto = true;
        if (this.codice.length() <= 2) 
            return corretto = false;
    
        if (!Character.isUpperCase(this.codice.toString().charAt(0)))
            return corretto = false;
        
        for (int i = 1; i < this.codice.length(); i++){
            if (!Character.isDigit(this.codice.toString().charAt(i)))
                return corretto = false;
        }
        return corretto;
    }

}

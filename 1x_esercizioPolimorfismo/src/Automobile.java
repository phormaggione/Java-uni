public class Automobile extends Veicolo {
    private String modello;

    public Automobile(String targa, int annoImmatricolazione, int peso, int potenza, String modello) {
        super(targa, annoImmatricolazione, peso, potenza);
        this.modello = modello;
    }
    public String getModello() {
        return this.modello;
    }    
    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public void printDatiVeicolo() {
        System.out.print("Dati Automobile:\nTarga: " +this.getTarga() + "\nAnno immatricolazione: " +this.getAnnoImmatricolazione() +"\nPeso: " +this.getPeso() + "\nPotenza: " +this.getPotenza() +"\nModello: " +this.getModello());
    }
    
}

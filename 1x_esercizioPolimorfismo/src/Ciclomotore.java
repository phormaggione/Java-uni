public class Ciclomotore extends Veicolo {
    
    public Ciclomotore(String targa, int annoImmatricolazione, int peso, int potenza) {
        super(targa, annoImmatricolazione, peso, potenza);
    }

    @Override
    public void printDatiVeicolo() {
        System.out.print("Dati Ciclomotore:\nTarga: " +this.getTarga() + "\nAnno immatricolazione: " +this.getAnnoImmatricolazione() +"\nPeso: " +this.getPeso() + "\nPotenza: " +this.getPotenza());

    }
}

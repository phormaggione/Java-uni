public abstract class Veicolo implements ElementoInventario {
    
    private String targa;
        
    public Veicolo(String targa, int annoImmatricolazione, int peso, int potenza) {
    this.targa = targa;
    this.annoImmatricolazione = annoImmatricolazione;
    this.peso = peso;
    this.potenza = potenza;
    }

    private int annoImmatricolazione;   
    private int peso;
    private int potenza;

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }
    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getPotenza() {
        return potenza;
    }
    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    @Override
    public String getCodice() {
        return this.targa; //è normale questa differenza di nomi, l'interfaccia è a un livello così alto di astrazione che non si interessa, nella gerarchia di veicolo il codice è la targa
    }

    @Override 
    public int getAnnoIscrizione() {
        return this.annoImmatricolazione;
    }

    @Override
    public void printElementoInventario() {
        this.printDatiVeicolo();  //questo si fa perchè c'è un livello di separazione per chi eredita da veicolo, non sa necessariamente che implementa ElementoInventario, per questo c'è questa delega
    }

    public void printDatiVeicolo(){
        System.out.print("Dati veicolo:\nTarga: " +this.getTarga() + "\nAnno immatricolazione: " +this.getAnnoImmatricolazione() +"\nPeso: " +this.getPeso() + "\nPotenza: " +this.getPotenza());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Veicolo other = (Veicolo) obj;
        if (targa == null) {
            if (other.targa != null)
                return false;
        } else if (targa.equals(other.targa))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((targa == null) ? 0 : targa.hashCode());
        return result;
    }


}
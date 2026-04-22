public class Azienda {

    public Azienda(int maxImpiegati) {
        int impiegatiInDB = 0;
        db = new impiegato[maxImpiegati];
    }

    public boolean aggiungiImpiegato(Impiegato i) {
        if (impiegatoInDB == db.length || findImpiegato(i.getName()) != null))
            return false;
        db[impiegatoInDB++] = i;
        return true;

    }

    public Impiegato findImpiegato(String name) {
        for(int i = 0; i< impiegatiInDB; i++)
            if (db[i].getName().equals(name))
                    return db[i];
        return null;
    } //resituisce il rif a impiegato, parametro di ingresso e uscita quindi
    //se vogliamo che le modifche non si riflettino bisogna restituire una copia ritornando l'oggetto costruito con una copia

    public boolean removeImpiegato(String name) {
        for(int i = 0; i < impiegatiInDB; i++)
            if(db[i].getName()).equals(name)) {
                for (int j = i+1; j < impiegatiInDB; j++)
                    db[j-1] = db[j];
                impiegatiInDB--;
                return true;
            }
        return false;
    }

    public void stampaStipendi() {
        for(int i = 0; i < impiegatiInDB; i++ ) {

            //per stampare l'oggetto in modo diretto tramite to string bisogna reimplementarla, altrimenti stampa nome oggetto + hashcode
        }

    public void alteraStipendio(double percent) {
        for(int i = 0; i< impiegatiInDB; i++) {
            db[i].setStipendio((int) (db[i].getStipendio * (1+percent)));
        }


    }
    }
}

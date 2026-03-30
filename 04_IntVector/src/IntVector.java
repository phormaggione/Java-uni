public class IntVector {
    private int v[];

    public IntVector(int size) { //costruttore con parametro
        super(); //evitabile, ha a che fare con il fatto che ogni obg deriva da java.util.object
        v = new int[size];
    }
    
    public IntVector(IntVector obj) { //costruttore per copia
        this.v = new int[obj.v.length]; //this serve per dire il vettore che sta venendo creato
        //questo costruttore copia tutti gli elementi del vettore puntato dal riferimento
        for(int i = 0; i<obj.v.length; i++) {
            this.v[i] = obj.v[i];
        }
    }

    public void add(int n) {
        int new_vector[] = new int[v.length+1];
        for (int i = 0; i<v.length; i++) {
            new_vector[i] = v[i];
        }
        new_vector[v.length] = n;
        v = new_vector; //scambio di riferimenti, altrimenti non si riflette sul chiamante
    }

    public void remove(int id) {
        int new_vector[] = new int[v.length-1];
        for (int i = 0; i<id; i++) {
            new_vector[i] = v[i];
        }
        for (int i = id+1; i<v.length; i++ ) {
            new_vector[i-1] = v[i];
        }
        v = new_vector;
    }

    public int get(int id) {
        return v[id];
    }

    public void set(int id, int n) {
        v[id] = n;
    }

    public int size() {
        return v.length;
    }
}
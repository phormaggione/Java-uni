import java.util.ArrayList;

public class Inventario {
    private java.util.List<ElementoInventario> listaInventario;

    public Inventario() {
        listaInventario = new ArrayList<ElementoInventario>(); //è tipo polimorfismo, impelemtanzione di interfaccia con correzzione??, array dinamico infatti no dim
    }

    public boolean add(ElementoInventario e) {
        return listaInventario.add(e);
    }

    public void remove(ElementoInventario e) {
        listaInventario.remove(e);
    }

    public ElementoInventario get(int index) {
        return listaInventario.get(index);
    }

    public int size() {
        return listaInventario.size();       
    }

    public void printInventario() {
        //finire
    }

}

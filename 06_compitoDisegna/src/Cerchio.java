public class Cerchio {
    private double x;
    private double y;
    private double raggio;    
    
    public Cerchio(double raggio) {
        super();
        this.raggio = raggio;
        this.x = 0;
        this.y = 0;
    }

    public double get_x(Cerchio obj) {return obj.x;}
    public double get_y(Cerchio obj) {return obj.y;}
    public double get_raggio(Cerchio obj) {return obj.raggio;}

    public void set_x(Cerchio obj, double new_x) {obj.x = new_x;}
    public void set_y(Cerchio obj, double new_y) {obj.y = new_y;}
    public void set_raggio(Cerchio obj, double new_raggio) {obj.raggio = new_raggio;}   

    public double area() {return Math.PI * this.raggio * this.raggio;}
    public double perimetro() {return 2 * Math.PI * this.raggio;}
}

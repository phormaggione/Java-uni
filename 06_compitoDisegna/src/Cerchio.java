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

    public double getX() {return this.x;}
    public double getY() {return this.y;}
    public double getRaggio() {return this.raggio;}

    public void setX(double newX) {this.x = newX;}
    public void setY(double newY) {this.y = newY;}
    public void setRaggio(double newRaggio) {this.raggio = newRaggio;}   

    public double area() {return Math.PI * this.raggio * this.raggio;} //metodi di istanza, il this non è obbligatorio
    public double perimetro() {return 2 * Math.PI * this.raggio;} 
}

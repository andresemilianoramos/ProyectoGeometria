
// Clase Punto
public class Punto {
    private int x, y;

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    public Punto(int x, int y) {this.x = x; this.y = y;}

    public int getX() {return x;}

    public int getY() {return y;}
}
class Rectangulo extends Punto {

    int ancho, alto;

    public Rectangulo(Punto p, int ancho, int alto) {
        super(p.getX(), p.getY());
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo: " + "ancho=" + ancho + ", alto=" + alto;
    }
    public Rectangulo(Punto p1, Punto p2) {
        this(p1, p2.getX(), p2.getY()); // utilizamos this() para hacer
        // tambien referencia al constructor anterior

    }

}





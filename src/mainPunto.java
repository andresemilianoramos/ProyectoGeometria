public class mainPunto {
    public static void main(String[] args) {


        Punto p = new Punto(1, 1);
        Punto p1 = new Punto(2,2);
        Punto p2 = new Punto (5,8);

        Rectangulo r = new Rectangulo(p, 8, 6);
        Rectangulo r2 = new Rectangulo(p1,p2);


        System.out.println(r);
        System.out.println();
        System.out.println(r2);


    }
}

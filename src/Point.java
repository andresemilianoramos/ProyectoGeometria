// Clase Punto
public class Point {
    int x, y;

    public Point(int x, int y) {this.x = x; this.y = y;}
    public Point() {}
    public void SetPoint(int x, int y){this.x = x; this.y = y; }


    static class Rectangle extends Point{
        int whith, height;

        public Rectangle (){super(); this.whith = 0; this.height = 0;}
        public Rectangle(Point p, int newWidth, int newHeight)
        {super(); this.whith = newWidth ; this.height = newHeight;}
        Point p1 = new  Point(2,2);
        public Rectangle(Point p1 , Point p2){
            this(p1, p2.x - p1.x, p2.y - p2.y);}

        @Override
        public String toString() {
            return
                "("+ x +" , " + y +") whith= " + whith + ", height= " + height + "; ";

        }



    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.SetPoint(4,7);

        Rectangle r1 = new Rectangle(null,8,6);
        r1.SetPoint(1,1);

        Point p1 = new Point(2,2);
        Point p2 = new Point(5,8);
        Rectangle r2 = new Rectangle(p1, p2);

        System.out.println(r.toString());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }

}

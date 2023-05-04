package New_OOP.Lect1;

public class Main {
    public static void main(String[] args) {
        Point2D a = new Point2D(10, 20);
        // Integer a = point2d.getX();
        // Integer b = point2d.getY();
        System.out.println(a.getX());
        System.out.println(a.getY());
        // Point2D.setY(50);
        System.out.println(a.getY());
        Point2D b = new Point2D(0);
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
        
    }
}

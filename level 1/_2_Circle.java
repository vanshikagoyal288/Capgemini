public class _2_Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();

        System.out.println();

        Circle c2 = new Circle(5.5);
        c2.display();
    }
}
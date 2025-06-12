package pkg_Liskov;

// Demo class
public class LSPDemoFixed {
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rect = new Rectangle2(5, 10);
        Shape square = new Square2(5);

        printArea(rect);
        printArea(square);
    }
}

package pkg_Liskov;

public class LSPDemo {
    public static void printArea(Rectangle r) {
        r.setWidth(5);
        r.setHeight(10);
        System.out.println("Area: " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        printArea(rect);

        Rectangle square = new Square();
        printArea(square);
    }
}

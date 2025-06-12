package pkg_Liskov;

// Base class
class Shape {
    public int getArea() {
        return 0; // Default
    }
}

// LSP-compliant Rectangle class
class Rectangle2 extends Shape {
    protected int width;
    protected int height;

    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

// LSP-compliant Square class (does not extend Rectangle2)
class Square2 extends Shape {
    protected int side;

    public Square2(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}


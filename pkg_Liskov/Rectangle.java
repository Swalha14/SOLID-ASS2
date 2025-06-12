package pkg_Liskov;
//without lsp//
class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Forces both to be the same
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height; // Forces both to be the same
    }
}

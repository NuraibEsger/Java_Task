public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}

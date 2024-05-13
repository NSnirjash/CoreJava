package geomatry;

public class Rectangle {

    double length = 1;
    double wedth = 1;

    public Rectangle() {
    }

    public Rectangle(double newLength, double newWedth) {
        this.length = newLength;
        this.wedth = newWedth;
    }

    public double getArea() {
        return length * wedth;
    }

    public double getPerimeter() {
        return 2 * (length + wedth);
    }

    public double getDiagonal() {
        double preResult = Math.pow(length, 2) + Math.pow(wedth, 2);
        return Math.pow(preResult, 0.5);
    }
}

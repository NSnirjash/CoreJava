package geomatry;

public class Squre {

    double side = 1;

    public Squre() {
    }

    public Squre(double newSide) {
        this.side = newSide;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getDiagonal() {
        return Math.pow(2, 0.5) * side;
    }
}

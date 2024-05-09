package geomatry;

public class Triangle {

    double base = 1;
    double height = 1;
    double hypotenuse = 1;

    public Triangle() {
    }
    
    
    public Triangle(double newBase, double newHeight, double newHypotenuse) {
        this.base=newBase;
        this.height=newHeight;
        this.hypotenuse=newHypotenuse;
    }
    

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
        return base + height + hypotenuse;
    }

}

package geomatry;

public class Circle {

    double radius = 1;

    public Circle() {
    }
    public Circle(double newRedius) {
        radius=newRedius;
    }
    
    

    public double getArea() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    public double getPerimeter() {
        double result = 2 * Math.PI * radius;
        return result;
    }
    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
}


package geometry;

public class Circle extends Geometry{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
//        double result=0.0;
        return 2*Math.PI*radius;
//        return super.grtPerimeter(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getArea() {
        return Math.PI * radius* radius;
//        return super.getArea(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}


package geometry;

public class Rectangle extends Geometry{
    private double length;
    private double wedth;

    public Rectangle() {
    }

    public Rectangle(double length, double wedth) {
        this.length = length;
        this.wedth = wedth;
    }

    

    @Override
    public double getPerimeter() {
        return  2 * (length + wedth);
//        return super.grtPerimeter(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getArea() {
        return length * wedth;
//        return super.getArea(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}

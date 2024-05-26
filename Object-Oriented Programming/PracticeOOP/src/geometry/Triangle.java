package geometry;

public class Triangle extends Geometry {

    private double base;
    private double side2;
    private double side3;
    private double height;

    public Triangle() {
    }

    public Triangle(double base, double side2, double side3, double height) {
        this.base = base;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return base + side2 + side3;
//        return super.grtPerimeter(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getArea() {
//         double s = (base + side2 + side3) / 2;
//        return Math.sqrt(s * (s - base) * (s - side2) * (s - side3));
        return (base * height)/2;

//        return super.getArea(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}

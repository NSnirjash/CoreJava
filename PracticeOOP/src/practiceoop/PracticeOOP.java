
package practiceoop;

import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class PracticeOOP {

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of Circle is: "+c.getPerimeter());
        System.out.println("Perimeter of Circle is: "+c.getArea());
        
        Rectangle r = new Rectangle(20, 10);
        System.out.println("Area of Rectangle is: "+r.getArea());
        System.out.println("Perimeter of Rectangle is: "+r.getPerimeter());
        
        Triangle t = new Triangle(10, 7, 7, 5);
        System.out.println("Area of Triangle is: "+t.getArea());
        System.out.println("Perimeter of Triangle is: "+t.getPerimeter());
    }
    
}

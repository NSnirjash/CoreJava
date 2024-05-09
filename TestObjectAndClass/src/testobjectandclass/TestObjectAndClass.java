
package testobjectandclass;

import geomatry.Circle;
import geomatry.Rectangle;
import geomatry.Squre;
import geomatry.Triangle;
import math.MaxMin;
import math.PrimeNumber;

public class TestObjectAndClass {

    public static void main(String[] args) {
        Circle c = new Circle(5);
//        c.setRadius(5);
        System.out.println("The area of this circle is "+c.getArea());
        System.out.println("The perimeter of this circle is "+c.getPerimeter());        
        
        Rectangle r = new Rectangle(12,9);
        System.out.println("The area of this rectangle is "+r.getArea());
        System.out.println("The perimeter of this rectangle is "+r.getPerimeter());
        System.out.println("The diagonal of this rectangle is "+r.getDiagonal());
        
        Triangle t= new Triangle(4,3,5);
        System.out.println("The area of this Triangle is "+t.getArea());
        System.out.println("The perimeter of this Triangle is "+t.getPerimeter());
        
        Squre s = new Squre(5);
        System.out.println("The area of this Squre is "+s.getArea());
        System.out.println("The perimeter of this Squre is "+s.getPerimeter());
        System.out.println("The diagonal of this Squre is "+s.getDiagonal());
        
        PrimeNumber pn = new PrimeNumber(12);
        System.out.println(pn.checkPrime());
        
        MaxMin maxMin= new MaxMin();
        maxMin.number1=50;
        maxMin.number2=80;
        maxMin.number3=30;
        System.out.println("The laegest number is: "+maxMin.findMaxNumber());
        System.out.println("The laegest number is: "+maxMin.findMinNumber());
        
        MaxMin m = new MaxMin(70, 20,40);
        System.out.println("The laegest number is: "+m.findMaxNumber());
        System.out.println("The laegest number is: "+m.findMinNumber());
    }
    
}

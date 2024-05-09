
package classtest;

import vehiclelist.Truck;

public class ClassTest {

    public static void main(String[] args) {
        Truck t= new Truck(1900, 180, 450000, "Black");
        System.out.println("Pricve of this truck is: "+t.getSalePrice());
    }
    
}

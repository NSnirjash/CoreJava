
package classtest2;

import calcprice.ElectronicProduct;

public class ClassTest2 {

    public static void main(String[] args) {
        ElectronicProduct ep = new ElectronicProduct(1, "Motorola", 28000);
        System.out.println("Price of this producy is: "+ep.getSalePrice());
    }
    
}

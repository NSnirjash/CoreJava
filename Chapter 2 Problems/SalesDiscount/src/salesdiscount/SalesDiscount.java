package salesdiscount;
import java.util.Scanner;
public class SalesDiscount {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the amount");
        double price = s.nextDouble();
        System.out.println("Discount");
        double disc = s.nextDouble();
        double amount=price-((price*disc)/100);
        System.out.println("Discount price of this product is: "+amount);
    }
    
}

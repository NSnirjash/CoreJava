/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salestax;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner (System.in);
        System.out.print("Enter parches amount: ");
        float price=s.nextFloat();
        System.out.print("Tax: ");
        float Tax=s.nextFloat();
        float amount=price+((price*Tax)/100);
        System.out.print("Price of this product is: "+amount);
    }
    
}

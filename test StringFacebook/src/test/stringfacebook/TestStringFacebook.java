
package test.stringfacebook;

import java.util.Scanner;


public class TestStringFacebook {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Email address or phone number");
       
        String userName=s.next();
         System.out.println("Enter your password");
        String userPass=s.next();
        String message=String.format("Wlcome %s to Google",userName);
        if(userName.equalsIgnoreCase("Someone") && userPass.equals("Some1234")){
        
            System.out.println("Welcome to Facebook");
        }
        else{
        System.out.println("invalid Username or password");
        }
    }
    
}

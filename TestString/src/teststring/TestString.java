
package teststring;

import java.util.Scanner;


public class TestString {

  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Email ID: ");
        String userEmail=s.next();
        String massege=String.format("Welcome %s to Google", userEmail);
        if(userEmail.equalsIgnoreCase("java")){
            System.out.println("Enter your password");
            String password=s.next();
            
            if(password.equals("Java1234")){
                System.out.println(massege);
            }
            else{
                System.out.println("Incorrect password");
            }
        }
        else{
            System.out.println("Couldnot fiond your password");
        }
    }
    
}

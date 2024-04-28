package loginvalidation;
import java.util.Scanner;
public class LoginValidation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter your Email address or phone number");
        System.out.println("Enter your password");
         
        String userName=s.next();
        String userPass=s.next();
        
        String message=String.format("Wlcome %s to Google",userName);
        if(userName.length()>3 && userName.length()<10){
        
            
            if(userName.equalsIgnoreCase("Someone") && userPass.equals("Some1234")){
                System.out.println("Welcome to Facebook");
            }
            else{
            System.out.println("Invalied username or password");
            }
        }
       
        else{
            System.out.println("UserName Must have more than 3 charecter and lees than 10 charrecter");
        }
    }
    
}

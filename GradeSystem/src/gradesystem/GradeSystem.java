
package gradesystem;

import java.util.Scanner;


public class GradeSystem {

    
    public static void main(String[] args) {
        
        Scanner mark= new Scanner(System.in);
        String grade="";
        
        System.out.println("Enter the mark here: ");
        int number=mark.nextInt();
        
        if(number<0){
            grade="please enter a positive number";
        }
        else if(number<=32){
            grade="F";
        }
        else if(number<=39){
            grade="D";
        }
        else if(number<=49){
            grade="C";
        }
        else if(number<=59){
            grade="B";
        }
        else if(number<=69){
            grade="A-";
        }
        else if(number<=79){
            grade="A";
        }
        else if(number<=100){
            grade="A+";
        }
        else{
            System.out.println("Invalid Number");
        }
        System.out.println(grade);
    }
    
}

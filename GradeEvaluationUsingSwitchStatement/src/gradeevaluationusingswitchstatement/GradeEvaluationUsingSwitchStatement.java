
package gradeevaluationusingswitchstatement;

import java.util.Scanner;

public class GradeEvaluationUsingSwitchStatement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = s.nextInt();
        char letterGrade;
        switch (mark/10) {
            case 10:
            case 9:
                letterGrade = 'A';
                
                break;
            case 8:
                letterGrade = 'B';
                
                break;
            case 7:
                letterGrade = 'C';
                
                break;
            case 6:
                letterGrade = 'D';
                
                break;
            
            default:
                letterGrade = 'F';
        }
        System.out.println("The corresponding letter grade for "+mark+" is "+letterGrade); 
    }
    
}

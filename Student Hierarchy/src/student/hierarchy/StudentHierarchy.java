/*
 * Design a superclass called Student with attributes like name, id, and grade. 
 * Then create subclasses like Undergraduate and Graduate inheriting from Student. 
 * Implement methods to calculate GPA or credits for each type of student.
 */
package student.hierarchy;

import student.Graduate;
import student.UnderGraduate;

/**
 *
 * @author User
 */
public class StudentHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UnderGraduate ug = new UnderGraduate(30, "Nirob", 101, 96);
        ug.displayInfo();
        System.out.println("GPA: "+ug.CalculateGPA());
        
        Graduate g = new Graduate(36, "Nirjash", 102, 108);
        g.displayInfo();
        System.out.println("GPA: "+g.CalculateGPA());
        
    }
    
}

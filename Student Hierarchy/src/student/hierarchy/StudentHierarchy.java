/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

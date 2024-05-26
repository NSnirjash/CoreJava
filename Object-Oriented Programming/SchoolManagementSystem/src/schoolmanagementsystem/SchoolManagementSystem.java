/*
 *
 * 1. Create a base class Person with private properties name and age. Provide public getters and setters.
 * 2. Create a subclass Teacher that extends Person and adds properties subject and salary.
 * 3. Create another subclass Student that extends Person and adds properties grade and studentID.
 * 4. Override the toString() method in both Teacher and Student to display their details.
 * 5. Demonstrate the creation of Teacher and Student objects and print their details using toString(). 
 * 
 */
package schoolmanagementsystem;

import person.Student;
import person.Teacher;

public class SchoolManagementSystem {

    public static void main(String[] args) {
        Teacher t = new Teacher("Mathematics", 25000, "Tota Miya", 39);
        System.out.println(t);
        Student s = new Student(2.5, 178405, "Rashed Hasan", 15);
        System.out.println(s);
    }
    
}

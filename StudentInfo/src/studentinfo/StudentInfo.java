
package studentinfo;

import java.util.ArrayList;

public class StudentInfo {

    public static void main(String[] args) {
        Student Nasif = new Student(101, "Nasif", "Nasif@gmail.com", 10000, 123456789);
        Student Nirjash = new Student(102, "Nirjash", "Nirjash@gmail.com", 8000, 123456789);
        Student Nirob = new Student(103, "Nirob", "Nirob@gmail.com", 12000, 123456789);
        Student Razu = new Student(104, "Razu", "Razu@gmail.com", 7500, 123456789);
        Student Maruf = new Student(105, "Maruf", "Maruf@gmail.com", 9000, 123456789);
        Student Rifat = new Student(106, "Rifat", "Rifat@gmail.com", 9500, 123456789);
        
        ArrayList<Student> studentList = new ArrayList<>();
        
        studentList.add(Nasif);
        studentList.add(Nirjash);
        studentList.add(Nirob);
        studentList.add(Razu);
        studentList.add(Maruf);
        studentList.add(Rifat);
        
        for(Student s: studentList){
        System.out.println(s);
        }
    }
    
}

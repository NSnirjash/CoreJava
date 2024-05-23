
package person;

public class Student extends Person{
    
    private double grade;
    private int id;

    public Student() {
    }

    public Student(double grade, int id) {
        this.grade = grade;
        this.id = id;
    }

    public Student(double grade, int id, String name, int age) {
        super(name, age);
        this.grade = grade;
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", grade='" + grade + '\'' +
                ", studentID='" + id + '\'' +
                '}';
    }

    
    
    
    
            
    
}

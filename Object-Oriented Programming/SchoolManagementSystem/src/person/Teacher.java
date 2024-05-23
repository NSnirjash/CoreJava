package person;

public class Teacher extends Person {

    private String subject;
    private double salary;

    public Teacher() {
    }

    public Teacher(String subject, double salary) {
        this.subject = subject;
        this.salary = salary;
    }

    public Teacher(String subject, double salary, String name, int age) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{"
                + "name='" + getName() + '\''
                + ", age=" + getAge()
                + ", subject='" + subject + '\''
                + ", salary=" + salary
                + '}';
    }

}

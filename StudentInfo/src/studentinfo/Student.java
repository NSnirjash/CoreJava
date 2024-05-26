
package studentinfo;

public class Student {
    private int id;
    private String Name;
    private String email;
    private double fees;
    private int cell;

    public Student() {
    }

    public Student(int id, String Name, String email, double fees, int cell) {
        this.id = id;
        this.Name = Name;
        this.email = email;
        this.fees = fees;
        this.cell = cell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", Name=" + Name + ", email=" + email + ", fees=" + fees + ", cell=" + cell + '}';
    }

    
    
}

package student;

public class UnderGraduate extends Student {

    private int totalCredit;

    public UnderGraduate() {
    }

    public UnderGraduate(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public UnderGraduate(int totalCredit, String name, int id, double grade) {
        super(name, id, grade);
        this.totalCredit = totalCredit;
    }

    
    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    @Override
    public double CalculateGPA() {
        return super.getGrade() / totalCredit;
//        return super.CalculateGPA(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}

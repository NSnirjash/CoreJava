
package employee;

public class RegularEmployee extends Employee{
    private double bonusParcentage;

    public RegularEmployee() {
    }

    public RegularEmployee(double bonusParcentage) {
        this.bonusParcentage = bonusParcentage;
    }

    public RegularEmployee(double bonusParcentage, String name, int id, double salary) {
        super(name, id, salary);
        this.bonusParcentage = bonusParcentage;
    }

    public double getBonusParcentage() {
        return bonusParcentage;
    }

    public void setBonusParcentage(double bonusParcentage) {
        this.bonusParcentage = bonusParcentage;
    }

    @Override
    public double calculateBonus() {
          return super.getSalary()*(bonusParcentage/100);
    }
    
    
}

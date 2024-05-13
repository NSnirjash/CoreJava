/*
 * Create a superclass called Employee with attributes like name, id, and salary. 
 * Then create subclasses like Manager and RegularEmployee inheriting from Employee. 
 * Implement methods to calculate bonuses or special allowances for each type of employee.
 */
package employee.hierarchy;

import employee.Manager;
import employee.RegularEmployee;

public class EmployeeHierarchy {

    public static void main(String[] args) {
        Manager m = new Manager(20, "Razu", 1201, 35000);
        System.out.println("Bonus is: "+m.calculateBonus());
        RegularEmployee re = new RegularEmployee(25, "Nirjash", 1205, 55000);
        System.out.println("Bonus is: "+re.calculateBonus());
    }
    
}

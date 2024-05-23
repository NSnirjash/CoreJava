
package appliance;

public class WashingMachine extends Appliance{

    public WashingMachine() {
    }

    public WashingMachine(String brand, int power) {
        super(brand, power);
    }
    
    public void startWash() {
        System.out.println(getBrand() + " washing machine is starting the wash cycle.");
    }
}

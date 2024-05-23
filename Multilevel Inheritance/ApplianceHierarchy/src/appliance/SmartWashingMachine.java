
package appliance;

public class SmartWashingMachine extends WashingMachine{

    public SmartWashingMachine() {
    }

    public SmartWashingMachine(String brand, int power) {
        super(brand, power);
    }
    
     public void connectToWiFi() {
        System.out.println(getBrand() + " smart washing machine is connecting to WiFi.");
    }
}

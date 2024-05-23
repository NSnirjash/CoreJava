
package appliance;

public class Appliance {
    private String brand;
    private int power;

    public Appliance() {
    }

    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }
    
    public void turnOn() {
        System.out.println(brand + " appliance is turning on.");
    }

    public void turnOff() {
        System.out.println(brand + " appliance is turning off.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    
}

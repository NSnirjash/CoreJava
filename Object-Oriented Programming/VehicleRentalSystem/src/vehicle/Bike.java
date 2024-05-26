
package vehicle;

public class Bike extends Vehicle{

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    private String type;

    public Bike() {
    }

    public Bike(String type) {
        this.type = type;
    }

    public Bike(String type, String make, String model, double rentalRate) {
        super(make, model, rentalRate);
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Bike " + getMake() + " " + getModel() + " of type " + type + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike " + getMake() + " " + getModel() + " of type " + type + " is stopping.");
    }
     
    
}


package vehicle;

public class Car extends Vehicle{
    private int numOfDoors;

    public Car() {
    }

    public Car(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public Car(int numOfDoors, String make, String model, double rentalRate) {
        super(make, model, rentalRate);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
    
    
    @Override
    public void start() {
        System.out.println("Car " + getMake() + " " + getModel() + " with " + numOfDoors + " doors is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car " + getMake() + " " + getModel() + " with " + numOfDoors + " doors is stopping.");
    }
    
    
            
}

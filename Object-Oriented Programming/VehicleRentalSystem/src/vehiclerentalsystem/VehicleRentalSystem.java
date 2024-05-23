/*
 * Question:
 * 1. Create an abstract class Vehicle with properties make, model, and rentalRate. 
 * Include abstract methods start() and stop().
 * 2. Create a subclass Car that extends Vehicle and adds a property numOfDoors. 
 * Implement start() and stop().
 * 3. Create another subclass Bike that extends Vehicle and adds a property type 
 * (e.g., mountain, road). Implement start() and stop().
 * 4.Demonstrate the creation and usage of Car and Bike objects and polymorphism by 
 * calling start() and stop() methods.
 * 
 */
package vehiclerentalsystem;

import vehicle.Bike;
import vehicle.Car;

public class VehicleRentalSystem {

    public static void main(String[] args) {
        Car c = new Car(4, "Toyota", "Camry", 50.0);
        c.start();
        c.stop();
        
        Bike b = new Bike("Trek", "X-Caliber", "mountain", 20.0);
        b.start();
        b.stop();
    }
    
}

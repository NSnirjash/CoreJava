/*
 * Question: Build a class hierarchy for vehicles:
 * 1. Create a base class called Vehicle with methods startEngine() and stopEngine().
 * 2. Create two subclasses: Car and Bike.
 * 3.In Car, add a method openTrunk().
 * 4. In Bike, add a method kickStart().
 * 5. Further, create two more subclasses from Car: Sedan and SUV.
 * 6. Implement additional methods in Sedan (openSunroof()) and SUV (enable4WD()).
 * 7. Demonstrate the functionality of each subclass and their methods.
 */
package vehiclehierarchy;

import vehicle.Bike;
import vehicle.Car;
import vehicle.Sedan;
import vehicle.Suv;
import vehicle.Vehicle;

public class VehicleHierarchy {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.startEngine();
        v.stopEngine();
        
        Car c = new Car();
        c.startEngine();
        c.stopEngine();
        c.openTrunk();
        
        Bike b = new Bike();
        b.startEngine();
        b.stopEngine();
        b.kickStart();
        
        Sedan s = new Sedan();
        s.startEngine();
        s.stopEngine();
        s.openTrunk();
        s.openSunroof();
        
        Suv suv = new Suv();
        suv.startEngine();
        suv.stopEngine();
        suv.openTrunk();
        suv.enable4WD();
    }
    
}

/*
 * Question:
 * Create a class hierarchy for household appliances using multilevel inheritance:
 * 1. Create a base class called Appliance with properties brand and power, and methods turnOn() and turnOff().
 * 2. Create a subclass WashingMachine that extends Appliance. Add a method startWash().
 * 3. Further, create a subclass SmartWashingMachine that extends WashingMachine. Add a method connectToWiFi().
 * 4. Demonstrate the functionality by creating objects of SmartWashingMachine and 
 *    using all the methods from Appliance, WashingMachine, and SmartWashingMachine.
 */
package appliancehierarchy;

import appliance.SmartWashingMachine;

public class ApplianceHierarchy {

    public static void main(String[] args) {
       SmartWashingMachine swm = new SmartWashingMachine("Local", 2000);
       swm.turnOn();
       swm.turnOff();
       swm.startWash();
       swm.connectToWiFi();
    }
    
}

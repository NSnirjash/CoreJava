/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiclemanagementsystem;

import vehicle.Car;
import vehicle.Motorcycle;
import vehicle.Vehicle;

public class VehicleManagementSystem {

    public static void main(String[] args) {
        Vehicle car = new Car("raw1982", "Toyota", 2015);
        System.out.println(car);
        car.start();
        car.stop();
        
        
        Vehicle motor = new Motorcycle("D-128545", "Discover", 2014);
        System.out.println(motor);
        motor.start();
        motor.stop();
       
    }
    
}

package vehiclemanagement;

import vehicle.Truck;

public class VehicleManagement {

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setRegularprice(2100);
        truck.setWeight(2001);
        System.out.println(truck.getSalePrice());
    }

}

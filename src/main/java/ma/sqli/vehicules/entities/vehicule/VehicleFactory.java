package ma.sqli.vehicules.entities.vehicule;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType , String fuelType , int numberOfDoors){
        switch (vehicleType){
            case "CAR"          : return new Car(fuelType , numberOfDoors);
            case "TRUCK"        : return new Truck(fuelType , numberOfDoors);
            case "MOTORCYCLE"   : return new MotorCycle(fuelType , numberOfDoors);
            default             : return null;
        }
    }
}

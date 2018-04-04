package ma.sqli.vehicules.entities;

public class Vehicle {

    private String vehicleType;
    private String fuelType;
    private int numberOfDoors;


    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle(String vehicleType, String fuelType, String numberOfDoors) {
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }
}

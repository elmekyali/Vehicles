package ma.sqli.vehicules.entities.vehicule;


public class Truck extends Vehicle {

    @Override
    public String getVehicleType() {
        return "TRUCK";
    }

    @Override
    public String move(String doorsClosed, float numberOfKm) {
        return vehiclePresenter.present(doorsClosed , numberOfKm , this , parser);
    }

    public Truck(String fuelType, int numberOfDoors) {
        super(fuelType, numberOfDoors);
    }
}

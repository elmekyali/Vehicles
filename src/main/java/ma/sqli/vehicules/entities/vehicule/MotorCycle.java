package ma.sqli.vehicules.entities.vehicule;

public class MotorCycle extends Vehicle {
    @Override
    public String getVehicleType() {
        return "MOTORCYCLE";
    }

    @Override
    public String move(String doorsClosed, float numberOfKm) {
        return vehiclePresenter.present(doorsClosed , numberOfKm , this , parser);
    }


    public MotorCycle(String fuelType, int numberOfDoors) {
        super(fuelType, numberOfDoors);
    }
}

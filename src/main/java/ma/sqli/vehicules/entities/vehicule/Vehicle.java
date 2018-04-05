package ma.sqli.vehicules.entities.vehicule;

import ma.sqli.vehicules.entities.fuel.FuelType;
import ma.sqli.vehicules.entities.fuel.FuelTypeFactory;
import ma.sqli.vehicules.parsers.DefaultParser;
import ma.sqli.vehicules.parsers.Parser;
import ma.sqli.vehicules.presenters.DefaultVehiclePresenter;
import ma.sqli.vehicules.presenters.VehiclePresenter;

public abstract class Vehicle {

    protected FuelType fuelType;
    protected int numberOfDoors;
    protected Parser parser = new DefaultParser();
    protected VehiclePresenter vehiclePresenter = new DefaultVehiclePresenter();

    public abstract String getVehicleType();
    public abstract String move(String doorClosed , float numberOfKm);

    public float willConsumeLiters(float numberOfKm) {
        return numberOfKm / fuelType.getKmPerL();
    }

    public Vehicle(String fuelType, int numberOfDoors) {
        FuelTypeFactory fuelTypeFactory = new FuelTypeFactory();
        this.fuelType = fuelTypeFactory.getFuelType(fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

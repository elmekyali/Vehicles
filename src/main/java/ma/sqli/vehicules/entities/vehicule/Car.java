package ma.sqli.vehicules.entities.vehicule;

import java.util.*;

public class Car extends Vehicle {
    @Override
    public String getVehicleType() {
        return "CAR";
    }

    @Override
    public String move(String doorsClosed, float numberOfKm) {
        return vehiclePresenter.present(doorsClosed , numberOfKm , this , parser);
    }

    public String carFigure (String[] doors){
        List<String> doorsFigure = Arrays.asList("  _\n" ," /" ," \\\n" ," /" ,"_\\");
        for (String door : doors) {
            int theNumberOfTheDoor = Integer.parseInt(door);
            doorsFigure.set(theNumberOfTheDoor , theNumberOfTheDoor == doorsFigure.size() - 1 ? "_|" : theNumberOfTheDoor % 2 == 0 ? " |\n" : " |");
        }
        return String.join("" , doorsFigure);
    }

    public Car(String fuelType, int numberOfDoors) {
        super(fuelType, numberOfDoors);
    }
}

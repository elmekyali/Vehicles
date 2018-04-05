package ma.sqli.vehicules;

import ma.sqli.vehicules.entities.vehicule.Vehicle;
import ma.sqli.vehicules.parsers.DefaultParser;
import ma.sqli.vehicules.parsers.Parser;

import java.util.*;

public class Vehicles {

    private Map<String , Vehicle> vehicles = new HashMap<>(); //Comparator.comparing(Vehicle::getVehicleType)
    private Parser parser = new DefaultParser();

    public Vehicles(String vehiclesInput) {
        parser.vehiclesParser(vehiclesInput , ", ")
                .forEach(vehicle ->
                    vehicles.put(parser.vehicleParser(vehicle , ":").getVehicleType() , parser.vehicleParser(vehicle , ":"))
                );
    }

    public String move(String vehicleType, String doorsClosed, String numberOfKm) {
        return vehicles.get(vehicleType).move(doorsClosed , parser.KmParser(numberOfKm , " "));
    }
}

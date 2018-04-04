package ma.sqli.vehicules;

import ma.sqli.vehicules.entities.Vehicle;
import ma.sqli.vehicules.parsers.DefaultParser;
import ma.sqli.vehicules.parsers.Parser;

import java.util.*;

public class Vehicles {

    private Set<Vehicle> vehicles = new TreeSet<>(Comparator.comparing(Vehicle::getVehicleType));
    private Parser parser = new DefaultParser();

    public Vehicles(String vehiclesInput) {
        parser.vehiclesParser(vehiclesInput , ", ").forEach(vehicle -> vehicles.add(parser.vehicleParser(vehicle , ":")));
    }

    public String move(String car, String s, String s1) {
        return "";
    }
}

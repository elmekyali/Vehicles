package ma.sqli.vehicules.parsers;


import ma.sqli.vehicules.entities.Vehicle;

import java.util.*;
import java.util.stream.Collectors;

public class DefaultParser implements Parser {

    @Override
    public List<String> vehiclesParser(String vehicles, String separator) {
        return Arrays.stream(vehicles.split(separator)).collect(Collectors.toList());
    }

    @Override
    public Vehicle vehicleParser(String vehicle, String separator) {
        String[] vehicleComponent = vehicle.split(separator);
        return new Vehicle(vehicleComponent[0] , vehicleComponent[1] , vehicleComponent[2]);
    }
}

package ma.sqli.vehicules.parsers;


import ma.sqli.vehicules.entities.vehicule.Vehicle;
import ma.sqli.vehicules.entities.vehicule.VehicleFactory;

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
        return new VehicleFactory().getVehicle(vehicleComponent[0] , vehicleComponent[1] , Integer.parseInt(vehicleComponent[2]));
    }

    @Override
    public String[] doorParser(String doors , String separator) {
        return doors.length() == 0 ? null : doors.split(separator);
    }

    @Override
    public float KmParser(String numberOfKM, String separator) {
        return Float.parseFloat(numberOfKM.split(separator)[0]);
    }
}

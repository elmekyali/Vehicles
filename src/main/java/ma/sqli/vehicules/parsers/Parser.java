package ma.sqli.vehicules.parsers;

import ma.sqli.vehicules.entities.Vehicle;

import java.util.*;

public interface Parser {
    List<String> vehiclesParser(String vehicles , String separator);
    Vehicle vehicleParser(String vehicle , String separator);
}

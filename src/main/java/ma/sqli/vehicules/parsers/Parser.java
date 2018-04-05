package ma.sqli.vehicules.parsers;

import ma.sqli.vehicules.entities.vehicule.Vehicle;

import java.util.*;

public interface Parser {
    List<String> vehiclesParser(String vehicles , String separator);
    Vehicle vehicleParser(String vehicle , String separator);
    String[] doorParser(String doors , String separator);
    float KmParser(String numberOfKM , String separator);
}

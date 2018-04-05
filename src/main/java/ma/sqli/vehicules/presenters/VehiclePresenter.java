package ma.sqli.vehicules.presenters;

import ma.sqli.vehicules.entities.vehicule.Vehicle;
import ma.sqli.vehicules.parsers.Parser;

public interface VehiclePresenter {

    String present (String doorsClosed, float numberOfKm , Vehicle vehicle , Parser parser);
}

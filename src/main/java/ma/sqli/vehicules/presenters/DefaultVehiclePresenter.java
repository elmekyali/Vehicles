package ma.sqli.vehicules.presenters;

import ma.sqli.vehicules.entities.vehicule.Car;
import ma.sqli.vehicules.entities.vehicule.Vehicle;
import ma.sqli.vehicules.parsers.Parser;

import java.util.Locale;

public class DefaultVehiclePresenter implements VehiclePresenter {
    @Override
    public String present(String doorsClosed, float numberOfKm, Vehicle vehicle , Parser parser) {
        String[] doors = parser.doorParser(doorsClosed , " ");
        int numberDoorsClosed = doors == null ? 0 : doors.length;
        if(numberDoorsClosed == vehicle.getNumberOfDoors())
        {
            return String.format(Locale.US ,"DOORS OK, MOVING. The %s will consume %.2f L" , vehicle.getVehicleType() , vehicle.willConsumeLiters(numberOfKm));
        }else if (vehicle instanceof Car) {
            return String.format(Locale.US ,"DOORS KO, BLOCKED \n%s" , ((Car) vehicle).carFigure(doors));
        }
        return "";
    }
}

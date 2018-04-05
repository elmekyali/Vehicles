package ma.sqli.vehicules.entities.fuel;

public class FuelTypeFactory {

    public FuelType getFuelType(String fuelType)
    {
        switch (fuelType) {
            case "Diesel"      : return new Diesel();
            case "Hybrid"      : return new Hybrid();
            case "Gasoline"    : return new Gasoline();
            default            : return null;
        }
    }

}

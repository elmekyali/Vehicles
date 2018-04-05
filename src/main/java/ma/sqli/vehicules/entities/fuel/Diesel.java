package ma.sqli.vehicules.entities.fuel;

public class Diesel implements FuelType {
    @Override
    public float getKmPerL() {
        return (float) (100.0 / 5.0);
    }
}

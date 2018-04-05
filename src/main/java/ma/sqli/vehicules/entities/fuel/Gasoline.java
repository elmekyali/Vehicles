package ma.sqli.vehicules.entities.fuel;

public class Gasoline implements FuelType {
    @Override
    public float getKmPerL() {
        return (float) (100.0 / 6.0);
    }
}

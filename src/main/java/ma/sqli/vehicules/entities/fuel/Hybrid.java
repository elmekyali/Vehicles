package ma.sqli.vehicules.entities.fuel;

public class Hybrid implements FuelType {

    @Override
    public float getKmPerL() {
        return (float) (100.0 / 3.0);
    }
}

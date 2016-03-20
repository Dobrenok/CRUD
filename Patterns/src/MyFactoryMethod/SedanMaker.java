package MyFactoryMethod;

/**
 * Created by Kilbirdih on 01.02.2016.
 */
public class SedanMaker implements CarMaker {
    @Override
    public Car createCar(String name, String body, String engine) {
        return new Sedan(name, body, engine);
    }
}

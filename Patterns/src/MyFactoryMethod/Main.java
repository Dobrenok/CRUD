package MyFactoryMethod;

/**
 * Created by Kilbirdih on 01.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        CarMaker carMaker = new SedanMaker();
        Car car = carMaker.createCar("Passat", "Sedan", "1.8 gasoline");
        carMaker = new GolfMaker();
        car = carMaker.createCar("GOlf", "Hatchback", "1.5 gasoline");
    }
}

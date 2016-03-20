package MyFactoryMethod;

/**
 * Created by Kilbirdih on 01.02.2016.
 */
public class Sedan implements Car {
    private String body;
    private String name;
    private String engine;
    public Sedan(String name, String body, String engine){
        this.body = body;
        this.name = name;
        this.engine = engine;
    }
    @Override
    public String getBody() {
        return body;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEngine() {
        return engine;
    }
}

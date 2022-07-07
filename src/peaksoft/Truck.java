package peaksoft;


public class Truck {
    private int id;
    private String model;
    private Driver driver;
    private State state;

    public Truck(int id, String model, Driver driver, State state) {
        this.id = id;
        this.model = model;
        this.driver = driver;
        this.state = state;
    }

    public Truck() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

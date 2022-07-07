package peaksoft;

public class Driver {
    private int id;
    private String name;

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Driver() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Driver getTruckMethod(int id, String name){
        Driver driver = new Driver();
        driver.id = id;
        driver.name = name;
        return driver;
    }
}

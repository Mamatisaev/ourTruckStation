package peaksoft;

public class Driver implements Driverable {
    private String id;
    private String name;

    public Driver(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void changeDriver() {
        System.out.println("");

    }

    @Override
    public void startDriving() {
        System.out.println("");

    }

    @Override
    public void startRepair() {
        System.out.println("");

    }
}
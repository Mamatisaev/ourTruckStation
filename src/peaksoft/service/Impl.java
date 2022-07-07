package peaksoft.service;

import peaksoft.Driver;
import peaksoft.State;
import peaksoft.Truck;

import java.util.ArrayList;
import java.util.List;

public class Impl implements Serices{
    List<Driver> drivers = new ArrayList<>();
    List<Truck>trucks = new ArrayList<>();

    @Override
    public String changeDriver() {
        for (int i = 0; i < drivers.size(); i++) {

        }
        return null;
    }

    @Override
    public State startDriving() {

        for (Truck t:trucks) {
            if (t.getState()==State.BASE){

            }
        }
        return null;
    }

    @Override
    public State startRepair() {
        return null;
    }
}

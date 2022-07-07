package peaksoft.service;

import peaksoft.Driver;
import peaksoft.State;

public interface Serices {

    String changeDriver();

    State startDriving();

    State startRepair();
}

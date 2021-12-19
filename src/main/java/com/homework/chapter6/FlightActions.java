package com.homework.chapter6;

public interface FlightActions {
    FlightInfo getInfo();

    Long getFlightTime();

    Double getEquippedMass();

    Double getAmountFuel();

    void sendToDestination();

    void repair();

    void refuel();

    void load();

    void unload();

    FragilityValueOfCargo getFragilityValueOfCargo();

    enum FragilityValueOfCargo {
        LOW,
        MEDIUM,
        HIGH
    }
}

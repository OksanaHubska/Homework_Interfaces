package com.homework.chapter6;

public class PassengerFlight implements PassengerFlightActions {
    @Override
    public Integer getNumberOfPassengers() {
        return 250;
    }

    @Override
    public FlightInfo getInfo() {
        return new FlightInfo();
    }

    @Override
    public Long getFlightTime() {
        return 0L;
    }

    @Override
    public Double getEquippedMass() {
        return 0.0;
    }

    @Override
    public Double getAmountFuel() {
        return 0.0;
    }

    @Override
    public void sendToDestination() {

    }

    @Override
    public void repair() {

    }

    @Override
    public void refuel() {

    }

    @Override
    public void load() {

    }

    @Override
    public void unload() {

    }

    @Override
    public FragilityValueOfCargo getFragilityValueOfCargo() {
        return FragilityValueOfCargo.LOW;
    }
}

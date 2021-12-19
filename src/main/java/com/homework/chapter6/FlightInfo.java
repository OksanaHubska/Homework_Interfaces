package com.homework.chapter6;

public class FlightInfo {
   String flightNumber;
   String destination;
   String aircraftBrand;
   StatusFlight status;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber( String flightNumber ) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination( String destination ) {
        this.destination = destination;
    }

    public String getAircraftBrand() {
        return aircraftBrand;
    }

    public void setAircraftBrand( String aircraftBrand ) {
        this.aircraftBrand = aircraftBrand;
    }

    public StatusFlight getStatus() {
        return status;
    }

    public void setStatus( StatusFlight status ) {
        this.status = status;
    }
}

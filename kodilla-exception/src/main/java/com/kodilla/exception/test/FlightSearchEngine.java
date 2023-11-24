package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airPorts = new HashMap<>();
        airPorts.put("Warsaw Chopin Airport", true);
        airPorts.put("Wroclaw Airport", true);
        airPorts.put("Airport Roma", false);
        airPorts.put("Berlin Airport", false);
        airPorts.put("Seychelles International Airport", true);
        airPorts.put("Sevilla Airport", true);

        boolean arrivalAirportExists = airPorts.containsKey(flight.getArrivalAirport());
        if (!arrivalAirportExists) {
            throw new RouteNotFoundException("route not found");
        } else {
            return arrivalAirportExists;
        }
    }
}

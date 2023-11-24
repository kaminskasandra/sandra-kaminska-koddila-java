package com.kodilla.exception.test;

public class FlightSearchEngineRunner {
    public static void main(String[] args) {
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        try {
            flightSearchEngine.findFlight(new Flight("Wroclaw Airport", "Airport Poznań"));
        } catch (RouteNotFoundException e) {
            System.out.println("Searching failed: " + e.getMessage());
        }
    }
}

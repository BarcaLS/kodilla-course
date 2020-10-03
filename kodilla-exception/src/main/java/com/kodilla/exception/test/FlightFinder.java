package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("San Escobar", false);
        airports.put("Centralny Port Lotniczy w Baranowie", false);
        airports.put("Pyrzowice", true);

        System.out.println("::: I'm starting searching \"" + flight.getArrivalAirport() + "\".");
        if(airports.get(flight.getArrivalAirport()) != null) {
            return airports.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Arrival airport \"" + flight.getArrivalAirport() + "\" doesn't exist.");
        }
    }
}

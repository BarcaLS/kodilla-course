package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;

import java.util.ArrayList;
import java.util.List;

public class FlightFinderRunner {
    public static void main(String[] args) throws RouteNotFoundException {
        int flightNumber = 1;

        Flight flight1 = new Flight("Balice", "Pyrzowice");
        Flight flight2 = new Flight("San Escobar", "Strefa 52");
        Flight flight3 = new Flight("Centralny Port Lotniczy w Baranowie", "Nazi base in Arctica");
        Flight flight4 = new Flight("Pyrzowice", "Warsaw");

        List<Flight> flightsToCheck = new ArrayList<>();
        flightsToCheck.add(flight1);
        flightsToCheck.add(flight2);
        flightsToCheck.add(flight3);
        flightsToCheck.add(flight4);

        FlightFinder flightFinder = new FlightFinder();

        for (Flight currentFlight : flightsToCheck) {
            System.out.println("Searching flight nr " + flightNumber);

            try {
                flightFinder.findFlight(currentFlight);
            } catch (RouteNotFoundException e) {
                System.out.println("Exception occured: " + e);
                System.out.println("Arrival airport is not found but I can continue searching.");
            }
            flightNumber++;
        }
        System.out.println("Koniec");
    }
}

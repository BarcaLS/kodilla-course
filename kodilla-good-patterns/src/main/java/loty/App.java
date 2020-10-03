package loty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        findFlightsFrom("Warszawa");
        findFlightsTo("Katowice");
        findFlightsWithInterstation("Warszawa", "Wrocław", "Katowice");
    }

    public static void findFlightsFrom(String source) {
        System.out.println("Szukam wszystkich lotów z [" + source + "]");
        List<Flight> flightList = FlightList.initializeFlightList().stream()
                .filter(s -> s.getSource().equals(source))
                .collect(Collectors.toList());
        for (Flight currentFlight : flightList) {
            System.out.println("::: Pasuje lot z [" + currentFlight.getSource() + "] do [" + currentFlight.getDestination() + "]");
        }
    }

    public static void findFlightsTo(String destination) {
        System.out.println("Szukam wszystkich lotów do [" + destination + "]");
        List<Flight> flightList = FlightList.initializeFlightList().stream()
                .filter(s -> s.getDestination().equals(destination))
                .collect(Collectors.toList());
        for (Flight currentFlight : flightList) {
            System.out.println("::: Pasuje lot z [" + currentFlight.getSource() + "] do [" + currentFlight.getDestination() + "]");
        }
    }

    public static void findFlightsWithInterstation(String source, String interstation, String destination) {
        System.out.println("Szukam wszystkich lotów z [" + source + "] przez [" + interstation + "] do [" + destination + "]");
        List<Flight> flightList1 = FlightList.initializeFlightList().stream()
                .filter(s -> s.getSource().equals(source))
                .filter(s -> s.getDestination().equals(interstation))
                .collect(Collectors.toList());
        List<Flight> flightList2 = FlightList.initializeFlightList().stream()
                .filter(s -> s.getSource().equals(interstation))
                .filter(s -> s.getDestination().equals(destination))
                .collect(Collectors.toList());
        List<Flight> flightList = new ArrayList<>();
        flightList.addAll(flightList1);
        flightList.addAll(flightList2);

        System.out.println("::: Możesz skonstruować swoją trasę z przesiądką z następujących lotów:");
        for (Flight currentFlight : flightList) {
            System.out.println("::: Lot z [" + currentFlight.getSource() + "] do [" + currentFlight.getDestination() + "]");
        }
    }
}
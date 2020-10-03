package loty;

import java.util.ArrayList;
import java.util.List;

public final class FlightList {
    public static List<Flight> initializeFlightList() {
        final List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Gdańsk", "Wrocław"));
        flightList.add(new Flight("Warszawa", "Wrocław"));
        flightList.add(new Flight("Katowice", "Kraków"));
        flightList.add(new Flight("Poznań", "Wrocław"));
        flightList.add(new Flight("Wrocław", "Katowice"));
        flightList.add(new Flight("Kraków", "Poznań"));
        flightList.add(new Flight("Warszawa", "Gdańsk"));
        return new ArrayList<>(flightList);
    }
}

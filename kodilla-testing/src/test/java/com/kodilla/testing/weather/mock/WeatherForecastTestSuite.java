package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    static Map<String, Double> temperaturesMap;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    public static void beforeAllTests() {
        temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateMediumTemperatureWithMock() {
        //Given
        double mediumTemperature = 0;
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        for (Map.Entry<String, Double> currentEntry : weatherForecast.calculateForecast().entrySet()) {
            mediumTemperature += currentEntry.getValue();
        }
        mediumTemperature = mediumTemperature / weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(26.56, mediumTemperature, 0.0000000000002);
    }

    @Test
    void testCalculateMedianTemperatureWithMock() {
        //Given
        double medianTemperature = 0;
        double allTemperatures[] = { 0, 0, 0, 0, 0 };
        int counter = 0;
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        for (Map.Entry<String, Double> currentEntry : weatherForecast.calculateForecast().entrySet()) {
            allTemperatures[counter] = currentEntry.getValue();
            counter++;
        }
        Arrays.sort(allTemperatures);
        if (allTemperatures.length % 2 == 0)
            medianTemperature = ((double)allTemperatures[allTemperatures.length/2] + (double)allTemperatures[allTemperatures.length/2 - 1])/2;
        else
            medianTemperature = (double) allTemperatures[allTemperatures.length/2];

        //Then
        Assertions.assertEquals(26.5, medianTemperature);
    }
}
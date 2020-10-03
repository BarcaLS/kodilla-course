package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        // Given
        int[] numbers = { 2, 7, 8, 5, 4, 9, 3, 2, 0, 10, 10, 5, 8, 4, 9, 3, 4, 0, 3, 8 };

        // When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(5.2, result);
    }
}

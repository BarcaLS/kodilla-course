package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class probablyIWillThrowExceptionTestSuite {
    @Test
    void testProbablyIWillThrowExceptionTestSuite() {
        // given & when & then
        assertDoesNotThrow(() -> ExceptionHandling.letsTryArithmetic(1,3));
        assertAll(
                () -> assertDoesNotThrow(() -> ExceptionHandling.letsTryArithmetic(1,1.5)),
                () -> assertDoesNotThrow(() -> ExceptionHandling.letsTryArithmetic(5,0)),
                () -> assertDoesNotThrow(() -> ExceptionHandling.letsTryArithmetic(2,3)),
                () -> assertDoesNotThrow(() -> ExceptionHandling.letsTryArithmetic(1,4.2))
        );
    }
}

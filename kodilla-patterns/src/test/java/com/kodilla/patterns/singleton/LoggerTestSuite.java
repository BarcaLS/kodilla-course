package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void openSettingsFile() {
        logger = Logger.INSTANCE;
        logger.log("2020-10-06 02:34 IntelliJ Critical Error: Your code is awful.");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        System.out.println("Opened: " + lastLog);
        //Then
        assertEquals("2020-10-06 02:34 IntelliJ Critical Error: Your code is awful.", lastLog);
    }
}

package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    void testCalculations () {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        // When
        double resultAdd = calculator.add(15.4, 13.2);
        double resultSub = calculator.sub(15.4, 13.2);
        double resultMul = calculator.mul(15.4, 13.2);
        double resultDiv = calculator.div(9.5, 0.5);

        // Then
        Assert.assertTrue(28.6 == resultAdd);
        assertEquals(2.2, resultSub, 0.0000001);
        Assert.assertTrue(203.28 == resultMul);
        Assert.assertTrue(19 == resultDiv);
    }
}

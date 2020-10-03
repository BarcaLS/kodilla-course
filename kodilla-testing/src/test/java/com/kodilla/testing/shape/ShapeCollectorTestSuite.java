package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

@DisplayName("TDD: Shape Test Suite")
class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("TDD: Beginning testing class ShapeCollector.")
    public class TestShapeCollector {

        @DisplayName("TDD: Testing addFigure()")
        @Test
        void testAddFigure() {
            //Given
            Triangle testTriangle = new Triangle("littleTriangle", 12);
            ShapeCollector testShapeCollector = new ShapeCollector(new ArrayList<>());
            //When
            boolean result = testShapeCollector.addFigure(testTriangle);
            //Then
            assertTrue(result);
        }

        @DisplayName("TDD: Testing removeFigure()")
        @Test
        void testRemoveFigure() {
            //Given
            Triangle testTriangle = new Triangle("LittleTriangle", 12);
            ShapeCollector testShapeCollector = new ShapeCollector(new ArrayList<>());
            testShapeCollector.addFigure(testTriangle);
            //When
            boolean result = testShapeCollector.removeFigure(testTriangle);
            //Then
            assertTrue(result);
        }

        @DisplayName("TDD: Testing getFigure()")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector testShapeCollector = new ShapeCollector(new ArrayList<>());
            Circle testCircle = new Circle("BigUglyCircle",5900);
            testShapeCollector.addFigure(testCircle);
            //When
            Shape testShape = testShapeCollector.getFigure(0);
            //Then
            assertEquals(testCircle, testShape);
        }

        @DisplayName("TDD: Testing showFigure()")
        @Test
        void testShowFigure() {
            //Given
            ShapeCollector testShapeCollector = new ShapeCollector(new ArrayList<>());
            testShapeCollector.addFigure(new Circle("BigUglyCircle",5900));
            testShapeCollector.addFigure(new Square("NonCircularSquare",100));
            testShapeCollector.addFigure(new Triangle("LittleTriangle",12));
            //When
            String testString = testShapeCollector.showFigures();
            //Then
            assertEquals("BigUglyCircle NonCircularSquare LittleTriangle ", testString);
        }
    }
}
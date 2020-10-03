package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when list is empty then exterminate() in OddNumbersExterminator class " +
            "should discover it"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> testList = new ArrayList<>();
        OddNumbersExterminator myExterminator = new OddNumbersExterminator();
        //When
        testList = myExterminator.exterminate(testList);
        //Then
        System.out.println("Size of testList: " + testList.size());
        Assertions.assertEquals(new ArrayList<>(), testList);
    }

    @DisplayName("when list contains odd and even numbers then exterminate() in OddNumbersExterminator class " +
            "should return list with only odd numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator myExterminator = new OddNumbersExterminator();
        List<Integer> testList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> testListCorrect = Arrays.asList(0, 2, 4, 6, 8, 10);
        //When
        testList = myExterminator.exterminate(testList);
        //Then
        System.out.print("\ntestList: ");
        Assertions.assertEquals(testListCorrect, testList);
        for(int i=0; i<testList.size(); i++)
            System.out.print(testList.get(i) + ",");
        System.out.print("\n");
    }
}

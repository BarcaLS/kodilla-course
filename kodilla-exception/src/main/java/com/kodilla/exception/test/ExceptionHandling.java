package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void letsTryArithmetic(double x, double y) {
        SecondChallenge secondchallenge = new SecondChallenge();
        try {
            secondchallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("An exception occured: " + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}

package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User userZ = new ZGeneration("userZ");
        User userY = new YGeneration("userY");
        User userMil = new Millenials("userMil");

        //When
        String userZPost = userZ.sharePost();
        System.out.println("UserZ: " + userZPost);
        String userYPost = userY.sharePost();
        System.out.println("UserY: " + userYPost);
        String userMilPost = userMil.sharePost();
        System.out.println("UserMil: " + userMilPost);

        //Then
        assertEquals("Publishing on Facebook.", userZPost);
        assertEquals("Publishing on Twitter.", userYPost);
        assertEquals("Publishing on Snapchat.", userMilPost);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User userZ = new ZGeneration("userZ");

        //When
        String userZPost = userZ.sharePost();
        System.out.println("UserZ: " + userZPost);
        userZ.setPublisher(new TwitterPublisher());
        userZPost = userZ.sharePost();
        System.out.println("UserZ: " + userZPost);

        //Then
        assertEquals("Publishing on Twitter.", userZPost);
    }
}
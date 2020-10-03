package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    List<String> stubUsersNames = new ArrayList<>();
    int stubPostsCount;
    int stubCommentsCount;
    CalculateStatistics calculateStatistics = new CalculateStatistics();

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
        for(int i=0; i<50; i++) {
            stubUsersNames.add("User nr " + i);
        }
        stubPostsCount = 870;
        stubCommentsCount = 1206;
    }

    @AfterEach
    public void after(){
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

    @Test
    void testCalculateAdvStatisticsWithMockWithZeroPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(stubUsersNames);
        stubPostsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(stubPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(stubCommentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        float calculatedPostsOnUser = 0.0f;
        float calculatedCommentsOnUser = 24.12f;
        float calculatedCommentsOnPost = 0;

        //When
        List<String> obtainedUsersNames = statisticsMock.usersNames();

        //Then
        Assertions.assertEquals(stubUsersNames, obtainedUsersNames);
        Assertions.assertEquals(stubPostsCount, calculateStatistics.postsNumber);
        Assertions.assertEquals(stubCommentsCount, calculateStatistics.commentsNumber);
        Assertions.assertEquals(calculatedPostsOnUser, calculateStatistics.postsOnUser);
        Assertions.assertEquals(calculatedCommentsOnUser, calculateStatistics.commentsOnUser);
        Assertions.assertEquals(calculatedCommentsOnPost, calculateStatistics.commentsOnPost);
        calculateStatistics.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsWithMockWithThousandPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(stubUsersNames);
        stubPostsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(stubPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(stubCommentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        float calculatedPostsOnUser = 20f;
        float calculatedCommentsOnUser = 24.12f;
        float calculatedCommentsOnPost = 1.206f;

        //When
        List<String> obtainedUsersNames = statisticsMock.usersNames();

        //Then
        Assertions.assertEquals(stubUsersNames, obtainedUsersNames);
        Assertions.assertEquals(stubPostsCount, calculateStatistics.postsNumber);
        Assertions.assertEquals(stubCommentsCount, calculateStatistics.commentsNumber);
        Assertions.assertEquals(calculatedPostsOnUser, calculateStatistics.postsOnUser);
        Assertions.assertEquals(calculatedCommentsOnUser, calculateStatistics.commentsOnUser);
        Assertions.assertEquals(calculatedCommentsOnPost, calculateStatistics.commentsOnPost);
        calculateStatistics.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsWithMockWithZeroComments() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(stubUsersNames);
        when(statisticsMock.postsCount()).thenReturn(stubPostsCount);
        stubCommentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(stubCommentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        float calculatedPostsOnUser = 17.4f;
        float calculatedCommentsOnUser = 0.0f;
        float calculatedCommentsOnPost = 0.0f;

        //When
        List<String> obtainedUsersNames = statisticsMock.usersNames();

        //Then
        Assertions.assertEquals(stubUsersNames, obtainedUsersNames);
        Assertions.assertEquals(stubPostsCount, calculateStatistics.postsNumber);
        Assertions.assertEquals(stubCommentsCount, calculateStatistics.commentsNumber);
        Assertions.assertEquals(calculatedPostsOnUser, calculateStatistics.postsOnUser);
        Assertions.assertEquals(calculatedCommentsOnUser, calculateStatistics.commentsOnUser);
        Assertions.assertEquals(calculatedCommentsOnPost, calculateStatistics.commentsOnPost);
        calculateStatistics.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsWithMockWithCommentsLessThanPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(stubUsersNames);
        stubPostsCount = 253;
        when(statisticsMock.postsCount()).thenReturn(stubPostsCount);
        stubCommentsCount = 182;
        when(statisticsMock.commentsCount()).thenReturn(stubCommentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        float calculatedPostsOnUser = 5.06f;
        float calculatedCommentsOnUser = 3.64f;
        float calculatedCommentsOnPost = 0.71936756f;

        //When
        List<String> obtainedUsersNames = statisticsMock.usersNames();

        //Then
        Assertions.assertEquals(stubUsersNames, obtainedUsersNames);
        Assertions.assertEquals(stubPostsCount, calculateStatistics.postsNumber);
        Assertions.assertEquals(stubCommentsCount, calculateStatistics.commentsNumber);
        Assertions.assertEquals(calculatedPostsOnUser, calculateStatistics.postsOnUser);
        Assertions.assertEquals(calculatedCommentsOnUser, calculateStatistics.commentsOnUser);
        Assertions.assertEquals(calculatedCommentsOnPost, calculateStatistics.commentsOnPost);
        calculateStatistics.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsWithMockWithCommentsMoreThanPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(stubUsersNames);
        stubPostsCount = 253;
        when(statisticsMock.postsCount()).thenReturn(stubPostsCount);
        stubCommentsCount = 2182;
        when(statisticsMock.commentsCount()).thenReturn(stubCommentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        float calculatedPostsOnUser = 5.06f;
        float calculatedCommentsOnUser = 43.64f;
        float calculatedCommentsOnPost = 8.624506f;

        //When
        List<String> obtainedUsersNames = statisticsMock.usersNames();

        //Then
        Assertions.assertEquals(stubUsersNames, obtainedUsersNames);
        Assertions.assertEquals(stubPostsCount, calculateStatistics.postsNumber);
        Assertions.assertEquals(stubCommentsCount, calculateStatistics.commentsNumber);
        Assertions.assertEquals(calculatedPostsOnUser, calculateStatistics.postsOnUser);
        Assertions.assertEquals(calculatedCommentsOnUser, calculateStatistics.commentsOnUser);
        Assertions.assertEquals(calculatedCommentsOnPost, calculateStatistics.commentsOnPost);
        calculateStatistics.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsWithMockWithZeroUsers() {
        //Given
        stubUsersNames.clear();
        when(statisticsMock.usersNames()).thenReturn(stubUsersNames);
        when(statisticsMock.postsCount()).thenReturn(stubPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(stubCommentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        float calculatedPostsOnUser = 0;
        float calculatedCommentsOnUser = 0;
        float calculatedCommentsOnPost = 1.3862069f;

        //When
        List<String> obtainedUsersNames = statisticsMock.usersNames();

        //Then
        Assertions.assertEquals(stubUsersNames, obtainedUsersNames);
        Assertions.assertEquals(stubPostsCount, calculateStatistics.postsNumber);
        Assertions.assertEquals(stubCommentsCount, calculateStatistics.commentsNumber);
        Assertions.assertEquals(calculatedPostsOnUser, calculateStatistics.postsOnUser);
        Assertions.assertEquals(calculatedCommentsOnUser, calculateStatistics.commentsOnUser);
        Assertions.assertEquals(calculatedCommentsOnPost, calculateStatistics.commentsOnPost);
        calculateStatistics.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsWithMockWithHundredUsers() {
        //Given
        stubUsersNames.clear();
        for(int i=0; i<100; i++) {
            stubUsersNames.add("User nr " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(stubUsersNames);
        when(statisticsMock.postsCount()).thenReturn(stubPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(stubCommentsCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        float calculatedPostsOnUser = 8.7f;
        float calculatedCommentsOnUser = 12.06f;
        float calculatedCommentsOnPost = 1.3862069f;

        //When
        List<String> obtainedUsersNames = statisticsMock.usersNames();

        //Then
        Assertions.assertEquals(stubUsersNames, obtainedUsersNames);
        Assertions.assertEquals(stubPostsCount, calculateStatistics.postsNumber);
        Assertions.assertEquals(stubCommentsCount, calculateStatistics.commentsNumber);
        Assertions.assertEquals(calculatedPostsOnUser, calculateStatistics.postsOnUser);
        Assertions.assertEquals(calculatedCommentsOnUser, calculateStatistics.commentsOnUser);
        Assertions.assertEquals(calculatedCommentsOnPost, calculateStatistics.commentsOnPost);
        calculateStatistics.showStatistics();
    }
}

package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Mock
    private Statistics statisticsMock;

    private StatisticsCalculator calculator;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        calculator = new StatisticsCalculator();
    }
    @Test
    public void testCalculateAdvStatisticsZeroPosts() {
        // Given
        List<String> users = Arrays.asList("user1", "user2", "user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        // When
        calculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, calculator.getAverageNumberOfPostsPerUser());
        assertEquals(3.33, calculator.getAverageNumberOfCommentsPerUser(), 0.01);
        assertEquals(0, calculator.getAverageNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {
        // Given
        List<String> users = Arrays.asList("user1", "user2", "user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        // When
        calculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(333.33, calculator.getAverageNumberOfPostsPerUser(),0.01);
        assertEquals(166.66, calculator.getAverageNumberOfCommentsPerUser(), 0.01);
        assertEquals(0.5, calculator.getAverageNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments() {
        // Given
        List<String> users = Arrays.asList("user1", "user2", "user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        calculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(16.66, calculator.getAverageNumberOfPostsPerUser(), 0.01);
        assertEquals(0, calculator.getAverageNumberOfCommentsPerUser());
        assertEquals(0, calculator.getAverageNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {
        // Given
        List<String> users = Arrays.asList("user1", "user2", "user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        // When
        calculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(33.33, calculator.getAverageNumberOfPostsPerUser(), 0.01);
        assertEquals(16.66, calculator.getAverageNumberOfCommentsPerUser(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        // Given
        List<String> users = Arrays.asList("user1", "user2", "user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

        // When
        calculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(16.66, calculator.getAverageNumberOfPostsPerUser(), 0.01);
        assertEquals(33.33, calculator.getAverageNumberOfCommentsPerUser(),0.01);
        assertEquals(2, calculator.getAverageNumberOfCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsZeroUsers() {
        // Given
        List<String> users = Collections.emptyList();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        // When
        calculator.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, calculator.getAverageNumberOfPostsPerUser());
        assertEquals(0, calculator.getAverageNumberOfCommentsPerUser());
        assertEquals(0.5, calculator.getAverageNumberOfCommentsPerPost());
    }
    @Test
    public void testCalculateAdvStatisticsHundredUsers() {
        // Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for(int n = 0; n < 100; n++){
            users.add("User " + n);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        calculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, calculator.getAverageNumberOfPostsPerUser(), 0.01);
        assertEquals(50, calculator.getAverageNumberOfCommentsPerUser(), 0.01);
        assertEquals(5, calculator.getAverageNumberOfCommentsPerPost(), 0.01);
    }
}

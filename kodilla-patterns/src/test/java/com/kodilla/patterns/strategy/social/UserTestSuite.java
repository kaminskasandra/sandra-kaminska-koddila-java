package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Kate");
        User user2 = new YGeneration("John");
        User user3 = new ZGeneration("Adam");

        //When
        String result1 = user1.sharePost();
        String result2 = user2.sharePost();
        String result3 = user3.sharePost();

        //Then
        Assertions.assertEquals("Twitter", result1);
        Assertions.assertEquals("Facebook", result2);
        Assertions.assertEquals("Snapchat", result3);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User user1 = new Millenials("Kate");
        user1.setSocialPublisher(new SnapchatPublisher());

        //When
        String result = user1.sharePost();

        //Then
        Assertions.assertEquals("Snapchat", result);
    }
}


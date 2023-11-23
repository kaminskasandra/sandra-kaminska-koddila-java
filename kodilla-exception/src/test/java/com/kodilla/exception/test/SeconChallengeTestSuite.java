package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AbstractSoftAssertions.assertAll;

public class SeconChallengeTestSuite {
    @Test
    public void probablyIWillThrowException(){

        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when & then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 1.6));
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 2.0));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.0));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 2.0));
    }
}

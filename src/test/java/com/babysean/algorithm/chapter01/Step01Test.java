package com.babysean.algorithm.chapter01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Step01Test {

    @ParameterizedTest
    @CsvSource(
            {"3, 4, 7", "2, 5, 7", "2, 7, 9", "2, 4, 6", "1, 3, 4"}
    )
    @DisplayName("두 정수를 더한 값을 출력한다.")
    void plusTwoNumbers(int first, int second, int expected) {
        // when
        Step01 step01 = Step01.builder()
                              .first(first)
                              .second(second)
                              .build();

        // then
        assertEquals(expected, step01.plus());
    }

    @ParameterizedTest
    @CsvSource(
            {"5, 1, 4", "7, 3, 4", "8, 1, 7", "5, 5, 0", "4, 6, -2"}
    )
    @DisplayName("두 정수를 뺀 값을 출력한다.")
    void minusTwoNumbers(int first, int second, int expected) {
        // when
        Step01 step01 = Step01.builder()
                              .first(first)
                              .second(second)
                              .build();

        // then
        assertEquals(expected, step01.minus());
    }

    @ParameterizedTest
    @CsvSource(
            {"1, 4, 4", "2, 6, 12", "3, 3, 9", "3, 9, 27", "5, 5, 25"}
    )
    @DisplayName("두 정수를 곱한 값을 출력한다.")
    void multiplyTwoNumbers(int first, int second, int expected) {
        // when
        Step01 step01 = Step01.builder()
                              .first(first)
                              .second(second)
                              .build();

        // then
        assertEquals(expected, step01.multiply());
    }

    @ParameterizedTest
    @CsvSource({
            "4, 1, 4",
            "1, 5, 0.2",
            "4, 5, 0.8",
            "2, 8, 0.25",
            "6, 3, 2"
    })
    @DisplayName("두 정수를 나눈 값을 출력한다.")
    void divideTwoNumbers(int first, int second, double expected) {
        // when
        Step01 step01 = Step01.builder()
                              .first(first)
                              .second(second)
                              .build();

        // then
        assertEquals(expected, step01.divide());
    }

}

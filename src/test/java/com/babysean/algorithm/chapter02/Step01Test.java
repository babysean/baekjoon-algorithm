package com.babysean.algorithm.chapter02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Step01Test {

    @ParameterizedTest
    @CsvSource(
            {"3, 4, <", "7, 4, >", "3, 3, ==", "50, 52, <", "10, 10, =="}
    )
    @DisplayName("두 정수를 비교하여 기호를 출력한다.")
    void compareToNumbers(int first, int second, String expected) {
        // when
        Step01 step01 = Step01.builder()
                              .first(first)
                              .second(second)
                              .build();

        // then
        assertEquals(expected, step01.differenceSymbol());
    }

}

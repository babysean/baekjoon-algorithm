package com.babysean.algorithm.chapter01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Step03Test {

    @ParameterizedTest
    @CsvSource(
            {"472, 35, 2360, 1416, 16520", "211, 26, 1266, 422, 5486", "261, 46, 1566, 1044, 12006", "167, 21, 167, 334, 3507", "626, 42, 1252, 2504, 26292"}
    )
    @DisplayName("곱셈의 세부 단계 값을 구하시오.")
    void getRemainder(int first, int second, int expected01, int expected02, int expected03) {
        // when
        Step03 step03 = Step03.builder()
                              .first(first)
                              .second(second)
                              .build();

        int[] revertSecond = step03.convertIntToRevertArray();

        // then
        assertEquals(expected01, first * revertSecond[0]);
        assertEquals(expected02, first * revertSecond[1]);
        assertEquals(expected03, step03.calculatorResult(revertSecond));
    }

}

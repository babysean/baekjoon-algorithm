package com.babysean.algorithm.chapter01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Step02Test {

    @ParameterizedTest
    @CsvSource(
            {"2568, 2025", "2569, 2026", "2543, 2000", "2643, 2100", "2545, 2002"}
    )
    @DisplayName("불기연도를 입력받아 서기연도로 출력한다.")
    void convertCommonEra(int buddhistEra, int expected) {
        // when
        Step02 step02 = Step02.builder()
                              .buddhistEra(buddhistEra)
                              .build();

        // then
        assertEquals(expected, step02.convertCommonEra());
    }

}

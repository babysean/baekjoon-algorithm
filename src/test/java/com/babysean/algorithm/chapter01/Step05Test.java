package com.babysean.algorithm.chapter01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Step05Test {
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        // System.out을 ByteArrayOutputStream으로 대체
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        // 원래 System.out 복원
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("개를 그리는 프로그램을 제작하시오.")
    void testPrintDog() {
        // 실행
        Step05 step05 = Step05.builder().build();
        step05.printDog();

        // 기대 문자열 조립 (OS별 개행 방지)
        String nl = System.lineSeparator();
        String expected =
                "|\\_/|"           + nl +
                        "|q p|   /}"      + nl +
                        "( 0 )\"\"\"\\"     + nl +
                        "|\"^\"`    |"      + nl +
                        "||_/=\\\\__|"     + nl;

        // 검증
        assertEquals(expected, outContent.toString());
    }
}

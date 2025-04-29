package com.babysean.algorithm.chapter01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Step04Test {

    private final PrintStream originalOut = System.out;

    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        // System.out을 ByteArrayOutputStream 으로 대체
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        // 원래 System.out 복원
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("고양이를 그리는 프로그램을 제작하시오.")
    void printCat() {
        // 준비
        Step04 step04 = Step04.builder()
                              .build();

        // 실행
        step04.printCat();

        // 기대 문자열 조립 (줄바꿈은 System.lineSeparator() 사용)
        String nl = System.lineSeparator();
        String expected = "\\      /\\" + nl + " )   (  ')" + nl + "(   /   )" + nl + " \\ (__) |" +
                nl;  // printCat 끝나고도 println이 마지막에 개행을 찍으므로

        // 검증
        assertEquals(expected, outContent.toString());
    }

}

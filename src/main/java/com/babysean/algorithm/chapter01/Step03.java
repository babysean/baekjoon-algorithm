package com.babysean.algorithm.chapter01;

import lombok.Builder;

import java.util.Scanner;

@Builder
public class Step03 {

    private final int first;

    private final int second;

    public Step03(int first, int second) {
        this.first = first;
        this.second = second;
    }

    // 전달받은 정수를 일의 자리부터 역순 배열로 반환하는 메서드
    public int[] convertIntToRevertArray() {
        // 먼저 정수의 자릿수를 카운트 (예: 20이면 2자리)
        int count = 0;
        int countTemp = second;

        while (countTemp != 0) {
            count++;
            countTemp /= 10;
        }

        // 결과 배열 생성
        int[] digits = new int[count];
        int index = 0;

        // 정수를 10으로 나눈 나머지를 사용하여 역순으로 배열에 저장
        int digitsTemp = second;
        while (digitsTemp != 0) {
            digits[index++] = digitsTemp % 10;
            digitsTemp /= 10;
        }

        return digits;
    }

    // 결과값을 계산하는 메서드
    public int calculatorResult(int[] revertSecond) {
        int result = 0;

        // 각 단계 결과 출력
        for (int j : revertSecond) {
            System.out.println(first * j);
        }

        for (int i = 0 ; i < revertSecond.length ; i++) {
            result += first * revertSecond[i] * Math.pow(10, i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner firstScanner = new Scanner(System.in);

        int first = firstScanner.nextInt();

        Scanner secondScanner = new Scanner(System.in);

        int second = secondScanner.nextInt();

        Step03 step03 = Step03.builder()
                              .first(first)
                              .second(second)
                              .build();

        int[] revertSecond = step03.convertIntToRevertArray();

        System.out.println("결과 : " + step03.calculatorResult(revertSecond));
    }

}

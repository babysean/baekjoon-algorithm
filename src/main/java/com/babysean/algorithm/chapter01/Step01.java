package com.babysean.algorithm.chapter01;

import lombok.Builder;

import java.util.Scanner;

@Builder
public class Step01 {

    private final int first;

    private final int second;

    public Step01(int first, int second) {
        this.first = first;
        this.second = second;
    }

    // 두 정수를 더한 값을 반환한다.
    public int plus() {
        return first + second;
    }

    // 두 정수를 뺀 값을 반환한다.
    public int minus() {
        return first - second;
    }

    // 두 정수를 곱한 값을 반환한다.
    public int multiply() {
        return first * second;
    }

    // 두 정수를 나눈 값을 반환한다.
    public double divide() {
        return (double) first / second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        Step01 step01 = Step01.builder()
                              .first(first)
                              .second(second)
                              .build();

        System.out.println(step01.plus());
        System.out.println(step01.minus());
        System.out.println(step01.multiply());
        System.out.println(step01.divide());
    }

}

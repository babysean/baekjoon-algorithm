package com.babysean.algorithm.chapter02;

import lombok.Builder;

import java.util.Scanner;

@Builder
public class Step01 {

    int first;

    int second;

    public Step01(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public String differenceSymbol() {
        int difference = first - second;

        if (difference == 0) {
            return "==";
        } else if (difference > 0) {
            return ">";
        } else {
            return "<";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // when
        Step01 step01 = Step01.builder()
                              .first(first)
                              .second(second)
                              .build();

        System.out.println("결과 : " + step01.differenceSymbol());
    }

}

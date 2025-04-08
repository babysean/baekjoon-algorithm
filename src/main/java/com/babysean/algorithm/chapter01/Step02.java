package com.babysean.algorithm.chapter01;

import lombok.Builder;

import java.util.Scanner;

@Builder
public class Step02 {

    private final int buddhistEra;

    public Step02(int buddhistEra) {
        this.buddhistEra = buddhistEra;
    }

    // 불기연도를 서기연도로 변환하여 반환한다.
    public int convertCommonEra() {
        return buddhistEra - 543;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int buddhistEra = scanner.nextInt();

        Step02 step02 = Step02.builder()
                              .buddhistEra(buddhistEra)
                              .build();

        System.out.println(step02.convertCommonEra());
    }

}

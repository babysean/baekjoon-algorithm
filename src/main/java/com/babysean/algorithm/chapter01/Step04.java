package com.babysean.algorithm.chapter01;

import lombok.Builder;

@Builder
public class Step04 {

    public void printCat() {
        System.out.println("\\      /\\");
        System.out.println(" )   (  ')");
        System.out.println("(   /   )");
        System.out.println(" \\ (__) |");
    }

    public static void main(String[] args) {
        Step04 step04 = Step04.builder()
                              .build();

        step04.printCat();
    }

}

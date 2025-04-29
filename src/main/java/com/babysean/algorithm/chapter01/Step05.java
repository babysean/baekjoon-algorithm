package com.babysean.algorithm.chapter01;

import lombok.Builder;

@Builder
public class Step05 {

    public void printDog() {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }

    public static void main(String[] args) {
        Step05 step05 = Step05.builder()
                              .build();

        step05.printDog();
    }

}

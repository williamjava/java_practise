package com.gui.practise.jdk8_new;

import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args) {
        Arrays.asList("a","b","c").forEach(v -> {
            System.out.println(v);
        });
    }
}

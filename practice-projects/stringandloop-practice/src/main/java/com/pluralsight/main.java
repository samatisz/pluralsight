package com.pluralsight;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String input = "Dallas|Ft. Worth|Austin";

        String[] cities = input.split("\\|");

        System.out.println(Arrays.toString(cities));

    }
}

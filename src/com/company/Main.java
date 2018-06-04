package com.company;


import java.util.Random;


public class Main {

    public static void main(String[] args) {
        output("Generated 10 random intergers between 5 and 95 ");
        Random rnd = new Random();

        for (int i = 1; i <= 10; ++i) {
            int randomInt = 5 + rnd.nextInt(95);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage) {
        System.out.println(aMessage);

    }
}

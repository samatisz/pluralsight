package com.pluralsight;

import java.util.Scanner;

public class Quotes {
    public static void main(String[] args) {
        String[] quotes = {
                "Don't worry about about yesterday, don't be perplexed by tomorrow, only make today more beautiful, because happiness will be just in time, it won't keep stopping for us. - Huang Renjun",
                "You gotta seize the opportunity. - Mark Lee ",
                "Just care about how to live this life of yours and that's going to make you happy enough. - Lee Taeyong",
                "The possibility of all those possibilities being possible is just another possibility that can possibly happen. - Mark Lee",
                "Life is still long, so don’t be unsure or insecure. Let’s just follow the flow of time. We will meet chance or opportunities and a new path. - Zhong Chenle",
                "Whenever i have a hard time, i think back to why i started this and why i have endured so far until now. - Kim Jungwoo",
                "You must learn to love yourselves before you can accept love from others. Otherwise, there will be moments when you doubt their love for you, right? But that's not good if you love yourself then you will learn to appreciate others love for you. - Kim Doyoung",
                "Be you, be unique, be crazy. You're beautiful - Lee Ten",
                "You're doing great, you can do it, you're moving, you're getting somewhere you know? - Suh Johnny",
        };

        Scanner quoteScanner = new Scanner(System.in);

        System.out.println("Please select a number from 1-10 to display a quote.");
        int input = quoteScanner.nextInt();

        System.out.println(quotes[input]);

        quoteScanner.close();





    }
}

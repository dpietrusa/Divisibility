package com.company;

public class Main {

    public static void main(String[] args) {

        int number;

        for (number = 2520; number >= 0 && number < 1000000000; number++) {
            if (number % 2 == 0 & number % 3 == 0 & number % 4 == 0 & number % 5 == 0 & number % 6 == 0 & number % 7 == 0 & number % 8 == 0 & number % 9 == 0 & number % 10 == 0 & number % 11 == 0 & number % 12 == 0 & number % 13 == 0 & number % 14 == 0 & number % 15 == 0 & number % 16 == 0 & number % 17 == 0 & number % 18 == 0 & number % 19 == 0 & number % 20 == 0)
            {
                System.out.print(number);
                break;
            }
        }
    }
}

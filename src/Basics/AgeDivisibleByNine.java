package Basics;

public class AgeDivisibleByNine {
    public static void main(String[] args) {
        int age = 21; // Set age here

        if (age < 18) {
            // Print numbers from 1 to 18
            for (int i = 1; i <= 18; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            // Print numbers from 18 to 100 that are divisible by 9
            for (int i = 18; i <= 100; i++) {
                if (i % 9 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}


package loops;

public class SumofNaturalNumber {
        public static void main(String[] args) {
            int N = 100; // Change this value as needed
            int sum = 1;

            for (int i = 1; i <= N; i++) {
                sum += i;
            }

            System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
        }
    }



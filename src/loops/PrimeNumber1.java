public class PrimeNumber1 {
    public static void main(String[] args) {
        int start = 32;
        int end = 1098;

        System.out.println("Prime numbers from " + start + " to " + end + ":");

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        // No even number other than 2 is prime
        if (num % 2 == 0) return false;

        // Check only up to the square root of num
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }
}

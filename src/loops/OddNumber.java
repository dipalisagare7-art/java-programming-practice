package loops;

public class OddNumber {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 21 to 121:");

        for (int i = 21; i <= 24; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}


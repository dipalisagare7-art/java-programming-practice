package loops;

public class LargestofTwo {
        public static void main(String[] args) {
            int num1 = 42;
            int num2 = 27;

            int largest;

            if (num1 > num2) {
                largest = num1;
            } else {
                largest = num2;
            }

            System.out.println("The largest number is: " + largest);
        }
    }


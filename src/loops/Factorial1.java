package loops;

public class Factorial1 {
    public static void main(String[] args) {
        int number = 5;
        int result = 1;
        for (int i  = 1; i <= 5; i++) {
         result = result*i;
        }
        System.out.println("Factorial of " + number + "  is :" + result );
    }
}

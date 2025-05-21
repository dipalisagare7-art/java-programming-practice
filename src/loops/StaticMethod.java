package loops;

public class StaticMethod {

    public static void m2() {
        System.out.println("immature");
    }

    public static void main(String[] args) {
        System.out.println("mature");

        int age = 18;

        if (age >= 18) {
            // Do nothing
        } else {
            m2();
        }

        System.out.println("exit");
    }
}
/*
"2. Fix the method with try-catch to get the correct result of division:
 */

public class lesson82 {
    public static void main(String[] args) throws Exception {
        System.out.println(divideByZero());
    }

    private static int divideByZero() {
        int a = 5;
        int b = 0;
        try {
            return a / b;
        } catch (ArithmeticException ae) {
            System.out.println("Division by zero");
            System.err.println(ae.getClass() + ". Exception get message: " + ae.getMessage() + "\n");
        } finally {
            return 0;
        }
    }
}

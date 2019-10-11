/*
"5. Throw a NullPointerException from the method iCanThrowException();
Handle it in the main method.
 */

public class lesson85 {
    public static void main(String[] args) {
        iCanThrowException();
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }
}
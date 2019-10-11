/*
"3. Finish the program to handle all the possible exceptions:
Print the cause of the exception to the console."
 */

public class lesson83 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println(a);

            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
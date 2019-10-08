/*
1. Create method to check:
if number < 0 print “Number < 0”,
if number > 0 print “Number > 0”
if number = 0 throw your own exception
 */

public class lesson81 {
    public static void main(String[] args) throws Exception {
        int number = 0;
        if (number < 0) {
            System.out.println("Number < 0");
        } else if (number  > 0) {
            System.out.println("Number > 0");
        } else if (number == 0) {
            throw new Exception();
        }
    }
}

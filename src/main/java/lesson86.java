/*
"6. Write a program that will enter numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
The code inside the readData is wrapped in a try..catch.
If the user entered some text, instead of entering a number,
the method should catch the exception and display all previously entered numbers as a result.
Numbers output from a new line preserving the order of input."
 */

import java.util.Scanner;

public class lesson86 {

    public static void main(String[] args) {
        readData();
    }
     private static void readData() {
        Scanner in = new Scanner(System.in);
        StringBuilder myBuilder = new StringBuilder();
        try {
            while (true) {
                myBuilder.append(Integer.valueOf(in.nextInt())).append(" ");
            }
        } catch (Exception e) {
            System.out.println(myBuilder.toString());
        }
    }
}
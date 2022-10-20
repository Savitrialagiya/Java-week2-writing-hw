package week2writinghw;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Program9_ConvertUpperToLowercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Uppercase String : ");
        String uppercase = scanner.nextLine();
        Program9_ConvertUpperToLowercase t = new Program9_ConvertUpperToLowercase();
        t.convertUppercaseToLowercase(uppercase);
        scanner.close();

    }
    public void convertUppercaseToLowercase(String text) {
        System.out.println("The Lower case String is : " + text.toLowerCase());
    }
}

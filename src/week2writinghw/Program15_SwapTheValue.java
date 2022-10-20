package week2writinghw;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Program15_SwapTheValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value : ");
        int second = scanner.nextInt();
        Program15_SwapTheValue t = new Program15_SwapTheValue();
        t.swapTheValue(first,second);
        scanner.close();
    }
    public void swapTheValue(int a, int b){
        int c;
        System.out.println("Before swapping, The value of the variable is : " + a + " and the second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping, The value of the first variable is : " + a + " and the second variable is : " + b);

    }

}

package week2writinghw;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */

public class Program17_DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to java program to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        scanner.close();
    }
    public static void convertDecimalToBinary(int number){
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}

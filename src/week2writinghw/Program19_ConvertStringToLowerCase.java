package week2writinghw;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Program19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence : ");
        String uppercase = scanner.nextLine();
        Program19_ConvertStringToLowerCase t = new Program19_ConvertStringToLowerCase();
        t.converTheStringToLowercase(uppercase);
        scanner.close();
    }
    public void converTheStringToLowercase(String str){
        System.out.println("The lowercase of the string is = " + str.toLowerCase());
    }
}

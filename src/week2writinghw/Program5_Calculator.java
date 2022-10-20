package week2writinghw;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Program5_Calculator {
    //static method
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }
    public static int subtraction(int a, int b){
       return a-b;
    }
    //instance method
    public void multiplication(int a, int b){
        int result = a*b;
        System.out.println("The Multiplication of " + a + " and " + b + " is : " + result);
    }
    public int division(int a, int b){
        return a/b;
    }
    public static void main(String []args){
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a= scanner.nextInt();
        System.out.println("Please enter second number : ");
        int b = scanner.nextInt();

        addition(a, b);

        int sunResult = subtraction(a, b);
        System.out.println("The subtraction of " + a + " and " + b + " is : " + sunResult);

        Program5_Calculator obj = new Program5_Calculator();
        obj.multiplication(a, b);

        int divresult = obj.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divresult);

        scanner.close();
    }
}

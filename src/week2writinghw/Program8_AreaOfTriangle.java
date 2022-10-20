package week2writinghw;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Program8_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of triangle : ");
        int length = scanner.nextInt();
        System.out.println( " Please enter the height of the triangle : ");
        int height = scanner.nextInt();
        areaOfTriangle(height,length);
        scanner.close();
    }

    public static void areaOfTriangle(int length, int height){
        int area = (length*height)/2;
        System.out.println("The area of Triangle is : "+ area);

    }
}

package week2writinghw;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Program6_AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        scanner.close();

    }
    //calculating the area of circle
    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The area of circle is : " + area);

    }
}

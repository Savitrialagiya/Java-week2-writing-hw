package week2writinghw;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7_TempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in feranheit : ");
        float temp = scanner.nextFloat();
        Program7_TempConversion t = new Program7_TempConversion();
        t.convertTempToDegreeCelcius(temp);
        scanner.close();
    }

    public void convertTempToDegreeCelcius(float temp) {
        float c = ((temp - 320 * 5 / 9));
        System.out.println("The temperature " + temp + "farenheit is equal to " + c + " degree celcius");
    }
}

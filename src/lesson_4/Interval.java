package lesson_4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input number in range [0-100]");
        double number = scan.nextDouble();

        if (number >= 0 && number <= 14) {
            System.out.println("Number is in range [0-14]");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Number is in range [15-35]");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Number is in range [36-50]");
        } else if (number >= 51 && number <= 100) {
            System.out.println("Number is in range [51-100]");
        } else {
            System.out.println("Number is out of range [0-100]. \n Please, be attentive!)");
        }
    }
}

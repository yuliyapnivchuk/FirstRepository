package lesson_7;

import java.util.Scanner;

public class Conversion {
    static void convertCurrency(double sum, double rate){
        System.out.println((double)(sum*rate));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input two numbers where the first is sum of money you want to convert and the second one is exchange rate!");
        double sum = scan.nextDouble();
        double rate = scan.nextDouble();
        convertCurrency(sum, rate);
    }
}

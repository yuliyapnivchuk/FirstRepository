package lesson_8;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input number in range [1-50]");
        int count = scan.nextInt();
        if (count < 0 || count > 50) {
            System.out.println("Incorrect input. Please, input number in range [1-50]");
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 1; i < count; i++) {
                System.out.println(a + b);
                c = a;
                a = b;
                b = c + b;

            }
            System.out.println("That's your Fibonaccy numbers! Enjoy!)");
        }
    }
}

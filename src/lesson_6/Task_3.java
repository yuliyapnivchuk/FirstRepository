package lesson_6;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input length of sides for rectangle! First number is height, second - length.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

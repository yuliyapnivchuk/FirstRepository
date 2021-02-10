package lesson_6;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input length of leg for triangle!");
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

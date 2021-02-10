package lesson_6;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input length of leg for triangle!");
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            int num = 1;
            for (int l = 0; l < a; l++) {
                if(l!= a)
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}

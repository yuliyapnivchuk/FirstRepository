package lesson_6;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input the number of clients!");
        int count = scan.nextInt();
        int factorial = 1;

        do{
           factorial *= count--;
        }
        while(count>0);
        System.out.println(factorial);
    }
}

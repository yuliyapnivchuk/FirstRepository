package lesson_6;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input two numbers where first is less than second!");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = 0;
        int count = 0;
        if(a > b){
            System.out.println("First number is less than second one, try again!");
        }

        for(int i = 0; i < (b-a-1); i++){
            count++;
            result += a+count;
        }

        System.out.println(result);
    }
}

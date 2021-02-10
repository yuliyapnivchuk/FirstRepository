package lesson_6;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte number = 0b1110;
        System.out.println(number);
        System.out.println(number&1);
        String binary = Integer.toBinaryString(number&1);
        System.out.println(binary);
        if( (number&1) == 0){
            System.out.println("your number is even");
        }else {
            System.out.println("your number is odd");
        }
    }
}

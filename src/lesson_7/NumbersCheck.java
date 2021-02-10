package lesson_7;

import java.util.Scanner;

public class NumbersCheck {
    static boolean isNumberPositive(int num) {
        return (num >= 0) ? true : false;
    }

    static boolean isNumberSimple(int num) {
        int[] arr = {2, 3, 5, 6, 9};
        boolean result = true;
        for (int i : arr) {
            if (num%i == 0 && num / i > 2) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input number and we will check if it simple number and if it positive number!");
        int num = scan.nextInt();
        boolean isPositive = isNumberPositive(num);
        boolean isSimple = isNumberSimple(num);
        if(isPositive){
            System.out.println("Inputted number is positive!");
        }else{
            System.out.println("Inputted number is negative!");
        }
        if(isSimple){
            System.out.println("In addition to it the number is Simple!");
        }else{
            System.out.println("In addition to it the number isn't Simple!");
        }
    }
}

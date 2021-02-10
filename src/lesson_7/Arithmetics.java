package lesson_7;

import java.util.Scanner;

public class Arithmetics {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Divide by zero is forbidden!");
        } else {
            System.out.println(a / b);
        }
    }

    static void sub(int a, int b) {
        System.out.println(a - b);
    }

    static void mul(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input two numbers!");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        System.out.println("Please, input * or / or + or -");
        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();

        switch (action) {
            case "*":
                mul(firstNum, secondNum);
                break;
            case "/":
                div(firstNum, secondNum);
                break;
            case "+":
                add(firstNum, secondNum);
                break;
            case "-":
                sub(firstNum, secondNum);
                break;
            default:
                System.out.println("You did wrong input of action with numbers! Try again!");
        }

    }
}

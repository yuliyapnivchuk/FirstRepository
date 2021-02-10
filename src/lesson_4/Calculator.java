package lesson_4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input first number for calculating!");
        double operand1 = scan.nextDouble();
        System.out.println("Please, input second number for calculating!");
        double operand2 = scan.nextDouble();
        System.out.println("Please, input sign of arithmetic operation!");
        String operationSign = scan.nextLine();

        switch (operationSign) {
            case "*":
                System.out.println("Result - " + (operand1 * operand2));
                break;
            case "+":
                System.out.println("Result - " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Result - " + (operand1 - operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("It is forbidden to divide by zero!!! Stupid people!!!");
                } else {
                    System.out.println("Result - " + (operand1 / operand2));
                }
                break;
            default:
                System.out.println("Sign of arithmetic operation isn't matches to following + - / * \n Try again!");
                break;
        }
    }

}


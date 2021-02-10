package lesson_8;

import java.util.Scanner;

public class Bank {
    static void loanState(int payment){
        if(payment<100){
            System.out.println("For this period amount of debt is " + (100-payment));
        }else if(payment==100){
            System.out.println("For this period your loan is ok. You are supposed to pay " + (700-payment) + " in the future");
        }
        else if(payment>100 && payment<700){
            System.out.println("For this period overpayment amount is " + (payment-100));
        }else if(payment==700){
            System.out.println("You have payed off your loan! Congratulation!");
        }else if(payment>700){
            System.out.println("What are you doing? Common! Your loan is smaller - 700!");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, pay off your loan! Input amount of payment! P.S. You are supposed to pay 100 for this period.");
        loanState(scan.nextInt());
    }
}

package lesson_8;

import java.util.Scanner;

public class BankNewVersion {
    static void LoanState(int payment) {
        Scanner scan = new Scanner(System.in);
        for (int count = 1; count <= 7; count++) {
            System.out.println("Please, do your payment!");
            int num = scan.nextInt();
            payment = payment + num;
            if (payment == 700) {
                System.out.println("Congratulation! You have payed your loan. Your mam will proud you!))");
                break;
            } else if (payment > 700) {
                System.out.println("Common! What are you doing! Your loan amount is 700!");
                break;
            } else if (payment == (count * 100)) {
                System.out.println("Your payment payed off your loan for this period!");
            } else if (payment < (count * 100)) {
                System.out.println("You have a debt due to current period! Amount = " + ((count * 100) - payment));
            } else if (payment > (count * 100)) {
                System.out.println("You have overpayed your loan for current period. Overpayment amount is = " + (payment - (count * 100)));
            }
        }
    }

    public static void main(String[] args) {

        LoanState(0);
    }
}

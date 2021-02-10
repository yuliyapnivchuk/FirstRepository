package lesson_3;

import java.util.Scanner;

public class devideOnFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please, input 4 numbers.");
        for(int i = 0; i < 4; i++){
            int n = scan.nextInt();
            if(n%5 == 0){
                System.out.print(n + " ");
            }
        }
    }
}

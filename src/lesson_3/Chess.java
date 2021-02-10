package lesson_3;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input coordinates of castle.");
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();

        if(a1==b1 || a2==b2){
            System.out.println("Yes!");
        }else{
            System.out.println("No!");
        }
    }
}

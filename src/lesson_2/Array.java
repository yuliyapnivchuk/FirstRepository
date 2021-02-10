package lesson_2;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the count of numbers, please!");
        int count = scan.nextInt();
        int n = 0;
        System.out.println("Input the array of numbers, please!");
        int[] arr = new int[count];
        try {
            for(int i = 0; i < count; i++) {
                arr[i] = scan.nextInt();
                if(arr[i]%2 == 0) {
                    n++;
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("First number isn't equal to count of numbers in the second line.");
            System.out.println("Please, try again!");
        }

        System.out.println("Count of odd numbers - " + n);
    }
}

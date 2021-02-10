package lesson_3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class three_points {
    public static void main(String[] args) {
        System.out.println("Please, do the input! It must be 3 numbers.");
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        final double MAX = Math.pow(10, 9);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > MAX) {
                System.out.println("Number index = " + i + " exceed the maximum allowable value.");
                break;
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[2]);
    }
}

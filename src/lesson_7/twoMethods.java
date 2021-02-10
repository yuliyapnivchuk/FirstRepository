package lesson_7;

import java.util.Scanner;

public class twoMethods {

    static int[] readArray() {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    static int[] sortArray(int[] arr) {
        int count = 0;
        boolean changeHasBeenOccured = true;
        while (changeHasBeenOccured) {
            changeHasBeenOccured = false;
            for (int i = 0; i < arr.length - 1 - count; i++) {
                if (arr[i] > arr[i + 1]) {
                    int num = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = num;
                    changeHasBeenOccured = true;
                }
            }
            count++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Please, do input");
        int[] arr = readArray();
        int[] sortedArr = sortArray(arr);
        for (int i : sortedArr) {
            System.out.println(i);
        }
    }
}

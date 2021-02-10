package lesson_5;

import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        int memory = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > Math.pow(10,9)) {
                System.out.println("Все печально!!!!)))");
            }else{
                array[i] = scan.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                memory=memory + array[i];
            }
        }
        System.out.println(memory);
    }
}
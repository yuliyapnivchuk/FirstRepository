package lesson_5;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte number = 0b0111100; //scan.nextByte(); підкажіть будь ласка чому сканер не зчитує такий формат і як взагалі таке зчитати?
        if (number % 2 == 0) {
            System.out.printf("Number %1$s is even number!", number);
        }else{
            System.out.printf("Number %1$s is odd number!", number);
        }
    }
}

package lesson_6;

import java.util.Scanner;

public class Ромб {
    public static void main(String[] args) {
        // ромб
        System.out.println("Enter a size value");
        Scanner reader = new Scanner(System.in);
        // записываем размер
        int value = reader.nextInt();
        // это переменная будет как переключатель
        boolean backwardMode = false;
        for (int i = 0; i < value; i++) {
            // тут принтим пустые строки
            System.out.println();
            for (int j = 0; j < value - i; j++) {
                // тут принтим пробелы что-бы сформировать симметричность
                System.out.print(" ");
            }
            // пример алгоритма для принта звездочек
            int counter = 0;
            while (counter <= i * 2) {
                counter++;
                System.out.print("*");
            }
            // если отрисовали первую часть переключаем флаг
            if (i == (value - 1)) {
                backwardMode = true;
            }
            // флаг переключен, включаем обратный счетчик
            if (backwardMode) {
                i = i - 2;
            }
            // когда обратный счетчик уйдет в минус прерываем работу
            if (backwardMode && i == -2){
                break;
            }
        }
    }
}

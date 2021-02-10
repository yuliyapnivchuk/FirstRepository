package home_work;

import java.text.DecimalFormat;
import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Введіть два числа (катети) в один рядок через пробіл для розрахунку площі прямокутного трикутника.");
        System.out.println("Числа повинні бути не більшими ніж 10^6");

        String s =  scan.nextLine();
        String[] arr = s.split(" ");
        double a = Float.parseFloat(arr[0]);
        double b = Float.parseFloat(arr[1]);
        double lim = Math.pow(10,6);
        if(a > lim || b > lim){
            System.out.println("Введені вами числа більші 10^6. Спробуйте знову ввівши менші числа.");
        }else {
            System.out.println("Площа трикутника з катетами - " + a + " та " + b +
                    " становить - " + String.format(df.format(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)))));
        }
    }
}

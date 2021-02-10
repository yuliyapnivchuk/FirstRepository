package lesson_8;
import java.util.Scanner;
public class Delivery {
    static int fuctorialCulc(int num, int fuctorial){
        fuctorial = fuctorial * --num;
        if(num > 1) {
            fuctorialCulc(num, fuctorial);
        }
        return fuctorial;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input number of clients!");
        int num = scan.nextInt();
        System.out.println(fuctorialCulc(num, num));
    }
}
import java.util.Scanner;

public class finish {
    static void reverse(String line) {
        int[] arr = new int[line.length()];
        for (int i = 0; i < line.length(); i++) {
            arr[i] = Integer.parseInt(line.substring(i, i + 1));
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] != 0) {
                System.out.print(arr[j]);
            }
        }

        System.out.println("\nThat's your result!)");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, Input number!");
        String line = scan.nextLine();
        reverse(line);
    }
}

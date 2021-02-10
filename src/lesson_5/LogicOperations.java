package lesson_5;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        x += y >> x++ * z;
        z = ++x & y * 5;
        y /= x + 5 | z;
        System.out.printf("X - %1$s\n", x);
        System.out.printf("Z - %1$s\n", z);
        System.out.printf("Y - %1$s\n", y);

        z = x++ & y * 5;
        x = y << x++ ^ z;
        System.out.printf("Z - %1$s\n", z);
        System.out.printf("X - %1$s\n", x);
    }
}

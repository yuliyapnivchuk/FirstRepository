package lesson_6;

public class New {
    public static void main(String[] args) {
        String binary = Integer.toBinaryString(-2);
        int decimal = Integer.parseUnsignedInt(binary,2);
        System.out.printf("binary: %s", binary);
        System.out.println();
        System.out.printf("decimal: %d", decimal);
    }
}

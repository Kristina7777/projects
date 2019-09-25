import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();
        print(num);

    }

    private static int inverse(int value) {
        int result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

    private static void print(int value) {
        System.out.println("введенное число = " + value + ";");
        System.out.println("перевернутое число = " + inverse(value) + ";");
    }


}
import java.util.Scanner;
public class Main {
    public static int sumThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Sum: " + sumThreeNumbers(a, b, c));
    }
}

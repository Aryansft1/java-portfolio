import java.util.Scanner;
public class Main {
    public static int calculate(int a, int b, char op) {

        if (op == '+')
            return a + b;
        if (op == '-')
            return a - b;
        if (op == '*')
            return a * b;
        return a / b;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char op = scanner.next().charAt(0);
        System.out.println("Result: " + calculate(a, b, op));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        String number = "";

        while (a > 0) {
            number = (a % b) + number;
            a /= b;
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';

            if (i % 2 == 0) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }
        }

        if (sum1 == sum2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

import java.util.Scanner;
public class Main {
    public static double average(int n) {
        return (n + 13) / 2.0;
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int largestDivisor(int n) {
        int max = 1;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.printf("Average: %.2f\n", average(n));
        boolean prime = isPrime(n);
        System.out.println("Is Prime: " + prime);
        if (prime == false) {
            System.out.println("Largest divisor (except itself): " + largestDivisor(n));
        }
    }
}

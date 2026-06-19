import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            if (i % 2 == 0) {
                System.out.println(i * i);
            } else {
                int j = 1;
                while (j <= i) {
                    System.out.print(j);
                    if (j + 2 <= i) {
                        System.out.print(" ");
                    }
                    j += 2;
                }
                System.out.println();
            }
        }
    }
}

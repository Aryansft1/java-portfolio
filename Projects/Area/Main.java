import java.util.Scanner;
public class Main {
    public static int calculateArea(int length, int width) {
        return length * width;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int width = input.nextInt();
        System.out.println("Area: " + calculateArea(length, width));
    }
}

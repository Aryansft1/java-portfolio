import java.util.Scanner;
public class Main {
    public static void showStudent(String name, int gpa) {
        System.out.println("Student: " + name + ", GPA: " + gpa);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();
        int gpa1 = scanner.nextInt();
        String name2 = scanner.next();
        int gpa2 = scanner.nextInt();
        String name3 = scanner.next();
        int gpa3 = scanner.nextInt();

        showStudent(name1, gpa1);
        showStudent(name2, gpa2);
        showStudent(name3, gpa3);

        String topName = name1;
        int topGpa = gpa1;
        if (gpa2 > topGpa) {
            topGpa = gpa2;
            topName = name2;
        }
        if (gpa3 > topGpa) {
            topGpa = gpa3;
            topName = name3;
        }
        System.out.println("Top student: " + topName + " with GPA " + topGpa);
    }
}

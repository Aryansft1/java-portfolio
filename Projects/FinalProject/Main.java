import java.util.Scanner;

public class Main {

    static int childCount = 0;
    static int actionCount = 0;
    static int dramaCount = 0;
    static int documentaryCount = 0;

    static int totalSales = 0;

    static String oldestName = "";
    static int oldestAge = 0;
    static String oldestMovie = "";

    public static void processCustomer(String name, int age, String movie) {

        int price = 0;

        if(movie.equalsIgnoreCase("children")) {
            price = 20000;
            childCount++;
        }
        else if(movie.equalsIgnoreCase("action")) {
            price = 40000;
            actionCount++;
        }
        else if(movie.equalsIgnoreCase("drama")) {
            price = 30000;
            dramaCount++;
        }
        else if(movie.equalsIgnoreCase("documentary")) {
            price = 25000;
            documentaryCount++;
        }

        if (age < 12) {
            price = price / 2;
        }
        else if (age > 60) {
            price = price / 2;
        }

        totalSales += price;

        if (age > oldestAge) {
            oldestAge = age;
            oldestName = name;
            oldestMovie = movie;
        }
    }

    public static void printReport() {

        System.out.println("Children tickets: " + childCount);
        System.out.println("Action tickets: " + actionCount);
        System.out.println("Drama tickets: " + dramaCount);
        System.out.println("Documentary tickets: " + documentaryCount);
        System.out.println("Total sales: " + totalSales);

        System.out.print("Oldest customer: ");
        System.out.print(oldestName+", ");
        System.out.print("Age: " + oldestAge+", ");
        System.out.println("Movie: " + oldestMovie);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            String name;

            do {
                name = scanner.next();
            } while (name.length() < 3);

            int age;

            do {
                age = scanner.nextInt();
            } while (age < 7 || age > 70);

            String movie;

            do {
                movie = scanner.next();
            }
            while (
                    !movie.equals("children") &&
                            !movie.equals("action") &&
                            !movie.equals("drama") &&
                            !movie.equals("documentary")
            );

            processCustomer(name, age, movie);
        }

        printReport();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckPrinterImproved {

    private static int findMaxLength(List<String> elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        List<String> dish = new ArrayList<>();
        List<String> count = new ArrayList<>();
        List<String> price = new ArrayList<>();
        for (String item : items) {
            String[] checkItem = item.split(",");
            dish.add(checkItem[0]);
            count.add(checkItem[1]);
            price.add(checkItem[2]);
        }
        for (String item : items) {
            String[] values = item.split(",");
            System.out.printf("%-10s%-10s%s%n", values[0], values[1], values[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i=0; i<n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}
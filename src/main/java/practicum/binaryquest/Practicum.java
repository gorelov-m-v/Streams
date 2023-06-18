package practicum.binaryquest;

import java.util.Random;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);

        while (true) {
            int number = s.nextInt();

            if (number < target) {
                System.out.println("Ваше число меньше");
            } else if (number > target) {
                System.out.println("Ваше число число больше");
            } else if (number == target) {
                System.out.println("Правильный ответ");
                break;
            }
        }
    }
}
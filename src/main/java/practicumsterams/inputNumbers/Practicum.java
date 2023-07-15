package practicumsterams.inputNumbers;

import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        List<Integer> inputNumbers = List.of(2, 5, 4, 2, 3, 8);
        List<Integer> evenNumbers = new ArrayList<>();

        inputNumbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(evenNumbers::add);

        System.out.println(evenNumbers);
    }
}
package practicum.airplain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Practicum {
    // Пример списка пассажиров (на самом деле их больше)
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        Map<String, Integer> result = new HashMap<>();
        int i = 1;
        for (String passengerName : passengerNames) {
            result.put(passengerName, i);
            i++;
        }
        return result;
    }
}
package data.tolocaldate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.*;


class Practicum {
    public static void main(String[] args) {
        LocalDate secretDate = LocalDate.of(2020, 1, 10);
        LocalTime secretTime = LocalTime.of(12, 30);

        int result = decode(secretDate, secretTime);
        System.out.println(result);
    }

    private static int decode(LocalDate secretDate, LocalTime secretTime) {
        // объедините secretDate и secretTime
        LocalDateTime newTime = LocalDateTime.of(secretDate, secretTime);

        // вычтите 2 месяца, 25 дней и 100 минут
        LocalDateTime secretMoment = newTime.minus(2, MONTHS)
                .minus(25, DAYS)
                .minus(100, MINUTES);
        // найдите произведение порядкового номера дня в году и часов из secretMoment
        return secretMoment.getDayOfYear() * secretMoment.getHour();
    }
}
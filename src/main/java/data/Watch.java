package data;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

class Watch {
    private ZonedDateTime currentTime;
    private int numOfZone;
    private final List<String> zones = Arrays.asList("America/New_York", "Asia/Vladivostok", "Europe/Moscow");

    public Watch() {
        numOfZone = 0;
        ZoneId zone = ZoneId.of(zones.get(numOfZone));
        LocalDateTime dateTime = LocalDateTime.of(2021, 1, 26, 0, 0);
        currentTime = ZonedDateTime.of(dateTime, zone);
    }

    public void changeTimeZone() {
        numOfZone = (numOfZone + 1) % 3;
        ZoneId newZone = ZoneId.of(zones.get(numOfZone));
        // смените временную зону (время должно остаться прежним)
        currentTime = currentTime.withZoneSameLocal(newZone);
    }

    public void addTenHours() {
        // увеличьте текущее время на 10 часов
        currentTime = currentTime.plus(10, HOURS);
    }

    public void addHour() {
        // увеличьте текущее время на 1 час
        currentTime = currentTime.plus(1, HOURS);
    }

    public void addTenMinutes() {
        // увеличьте текущее время на 10 минут
        currentTime = currentTime.plus(10, MINUTES);
    }

    public void addMinute() {
        // увеличьте текущее время на 1 минуту
        currentTime = currentTime.plus(1, MINUTES);
    }

    public ZonedDateTime getCurrentTime() {
        // верните текущее время
        return currentTime;
    }
}

class Practicum1 {
    public static void main(String[] args) {
        Watch watch = new Watch();

        watch.changeTimeZone();
        watch.changeTimeZone();
        watch.addTenHours();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addTenMinutes();
        watch.addTenMinutes();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();

        System.out.println(watch.getCurrentTime());
    }
}
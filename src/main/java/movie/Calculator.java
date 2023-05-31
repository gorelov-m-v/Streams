package movie;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double totalMins = 0;
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Movie) {
                totalMins = totalMins + mediaItem.getRuntime();
            } else if (mediaItem instanceof Series) {
                totalMins = totalMins + ((Series) mediaItem).getSeriesCount() * mediaItem.getRuntime();
            }
        }
        return  totalMins / (60 * 24);
    }

}
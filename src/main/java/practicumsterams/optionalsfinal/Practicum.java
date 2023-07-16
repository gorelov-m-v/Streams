package practicumsterams.optionalsfinal;

import java.util.Optional;

public class Practicum {
    public static void main(String[] args) {
        // Доработайте данный метод, чтобы на экран выводилось
        // сообщение в соответствии с заданием

        SearchService searchService = new SearchService();
        Optional<Candy> test = searchService.search("Африка");

        if (test.isPresent()) {
            Candy candyIsPresent = test.get();
            System.out.println("Товар " + "\"[" + candyIsPresent.name + "]\""
                    + " доступен в количестве " + candyIsPresent.amount
                    + " кг по цене " + (int) candyIsPresent.price
                    + " руб за кг");
        } else {
            System.out.println("Данный товар не найден");
        }
    }
}
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.lang.Math.pow;

class InflationProblem {

    public static long calculateTotalPriceInFuture(int numberOfYears, List<Grocery> groceries) {
        long veg = groceries.stream()
                .filter(g -> g.getCategory().equals(Category.VEGETABLES))
                .map(Grocery::getCost)
                .map(cost -> cost * (long)pow(3, numberOfYears))
                .reduce(0L, Long::sum);

        long fru = groceries.stream()
                .filter(g -> g.getCategory().equals(Category.FRUITS))
                .map(Grocery::getCost)
                .map(cost -> cost * (long)pow(4, numberOfYears))
                .reduce(0L, Long::sum);

        long dia = groceries.stream()
                .filter(g -> g.getCategory().equals(Category.DAIRY))
                .map(Grocery::getCost)
                .map(cost -> cost * (long)pow(2, numberOfYears))
                .reduce(0L, Long::sum);

        if (numberOfYears == 0) {
            return groceries.stream()
                    .map(g -> g.getCost())
                    .reduce(0L,Long::sum);
        } else {
            return veg + fru + dia;
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int numberOfYears = Integer.parseInt(scanner.nextLine());

//        List<Grocery> groceries = Stream.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
//                .map(i -> scanner.nextLine())
//                .map(inputLine -> {
//                    String[] parts = inputLine.split("\\s+");
//                    return new Grocery(Long.parseLong(parts[0]), Category.valueOf(parts[1]));
//                })
//                .collect(Collectors.toList());
//
//        long totalPriceInFuture = calculateTotalPriceInFuture(numberOfYears, groceries);

        List<Grocery> groceries = List.of(
                new Grocery(15, Category.VEGETABLES),
                new Grocery(30, Category.VEGETABLES),
                new Grocery(10, Category.FRUITS),
                new Grocery(20, Category.DAIRY)
        );
        long totalPriceInFuture = calculateTotalPriceInFuture(0, groceries);

        System.out.println(totalPriceInFuture);
    }
}

enum Category {
    VEGETABLES,
    FRUITS,
    DAIRY
}

class Grocery {
    private final long cost;
    private final Category category;

    // Imagine that this class has some other fields but they are skipped for simplicity

    public Grocery(long cost, Category category) {
        this.cost = cost;
        this.category = category;
    }

    public long getCost() {
        return cost;
    }

    public Category getCategory() {
        return category;
    }
}
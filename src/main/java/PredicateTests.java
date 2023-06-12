import java.time.LocalTime;
import java.util.Locale;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTests {
   Predicate<String> startsWithDigit = s -> !s.isEmpty() && Character.isDigit(s.charAt(0));
   IntPredicate isEven = val -> val % 2 == 0;

   Predicate<LocalTime> isLunchTime = time -> time.isAfter(LocalTime.of(12,0,0))
                                           && time.isBefore(LocalTime.of(14,0,0));

    public static void main(String[] args) {


        PredicateTests predicateTests = new PredicateTests();

        System.out.println(predicateTests.startsWithDigit.test("1hello"));
        System.out.println(predicateTests.startsWithDigit.test("hello"));

        System.out.println(predicateTests.isEven.test(55));
        System.out.println(predicateTests.isEven.test(56));
    }
}

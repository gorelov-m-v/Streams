import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class TernaryIntPredicate {
    public static void main(String[] args) {
        UnaryOperator<Integer> operator = x -> x * 2 + 1;
        int result = operator.compose(operator).apply(10);
        System.out.println(result);
    }

}



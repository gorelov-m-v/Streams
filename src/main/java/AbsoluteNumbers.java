import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class AbsoluteNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .map(Math::abs)
//                .map(Object::toString)
                .map(n -> n.replace("-", ""))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
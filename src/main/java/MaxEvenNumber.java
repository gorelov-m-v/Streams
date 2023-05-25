import java.util.*;
import java.util.stream.Collectors;

class MaxEvenNumber {

	public static int findMaxEvenNumber(Collection<Integer> numbers) {
		return numbers.stream()
				.filter(n -> n % 2 == 0)
				.max(Integer::compare)
				.orElse(0);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Set<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
				.map(Integer::parseInt)
				.collect(Collectors.toSet());

		System.out.println(findMaxEvenNumber(numbers));

	}
}
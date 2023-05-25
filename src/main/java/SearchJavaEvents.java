import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SearchJavaEvents {

	public static void printSortedJavaEvents(List<String> events) {
		Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
		events.stream()
				.filter(e -> pattern.matcher(e).find())  // .filter(e -> e.toLowerCase().contains("java"))
				.sorted()
				.forEach(System.out::println);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> events = Stream
				.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
				.map(i -> scanner.nextLine())
				.collect(Collectors.toList());

		printSortedJavaEvents(events);
	}
}
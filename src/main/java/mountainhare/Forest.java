package mountainhare;
import java.util.List;

public class Forest {
	private List<MountainHare> hares;
	public String season;

	public Forest(List<MountainHare> hares) {
		this.hares = hares;
	}

	public static void setSeason(String newSeason) {
		if (newSeason.equals("Зима") || newSeason.equals("Весна")) {
			MountainHare.color = "Белый";
		} else if (newSeason.equals("Лето") || newSeason.equals("Осень")) {
			MountainHare.color = "Серый";
		}
	}
	// в этом методе реализуйте логику смены цвета шубок зайцев-беляков

	public void printHares() {
		hares.stream()
				.forEach(System.out::println);
	}

}
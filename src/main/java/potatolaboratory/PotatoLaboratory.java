package potatolaboratory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        Potato potato1 = new Potato(1, 30, 30, 30);
        System.out.println(potato1.calculateAlpha(potato1));
        Potato potato2 = new Potato(2, 35, 31, 35);
        System.out.println(potato2.calculateAlpha(potato2));
        Potato potato3 = new Potato(3, 40, 35, 44);
        System.out.println(potato3.calculateAlpha(potato3));
        Potato potato4 = new Potato(4, 28, 44, 41);
        System.out.println(potato4.calculateAlpha(potato4));
        Potato potato5 = new Potato(5, 33, 23, 30);
        System.out.println(potato5.calculateAlpha(potato5));
        Potato potato6 = new Potato(6, 35, 33, 33);
        System.out.println(potato6.calculateAlpha(potato6));
        Potato potato7 = new Potato(7, 38, 41, 24);
        System.out.println(potato7.calculateAlpha(potato7));

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
        List<Potato> list = new ArrayList<>(potatoes);
        List<Potato> experiment = new ArrayList<>();

        experiment.add(0,Collections.min(list));
        list.remove(Collections.min(list));
        experiment.add(1,Collections.min(list));

        experiment.add(2,Collections.max(list));
        list.remove(Collections.max(list));
        experiment.add(3,Collections.max(list));

        Collections.sort(experiment);

        return experiment;
    }
}
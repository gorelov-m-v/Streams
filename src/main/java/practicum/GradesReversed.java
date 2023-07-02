package practicum;

import java.util.ArrayList;
import java.util.List;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        List<String> newGrades = new ArrayList<>();
        for (String grade : grades) {
            String[] gradeSplit = grade.replaceAll("— ", "").split(" ");
            newGrades.add(String.join(",", gradeSplit[0].toLowerCase()
                                                         , gradeSplit[1].toLowerCase()
                                                         , gradeSplit[2]
                                                         , gradeStringToInt(gradeSplit[3])));

        }
        return String.join(";", newGrades);
    }

}
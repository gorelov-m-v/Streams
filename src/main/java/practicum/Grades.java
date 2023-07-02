package practicum;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        String[] students = grades.split(";");
        for (String student : students) {
            String[] studentInfo = student.split(",");
            StringBuilder sb  = new StringBuilder();
            sb.append(capitalize(studentInfo[0])).append(" ");
            sb.append(capitalize(studentInfo[1])).append(" ");
            sb.append(studentInfo[2].toLowerCase()).append(" — ");
            sb.append(gradeToString(studentInfo[3]));
            System.out.println(sb.toString());
        }
    }


}
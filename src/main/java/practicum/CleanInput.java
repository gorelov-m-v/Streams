package practicum;

public class CleanInput {
    public String fixString(String str) {

        if (str.isBlank() || str.isEmpty()){
            return new String("Вы ничего не ввели");
        } else {
            return str.trim();
        }
    }
}

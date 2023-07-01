public class FindRepeats {
    static int numberOfRepeats(String text, String substring) {
        StringBuilder sb = new StringBuilder(text);
        int count = 0;
        while (sb.indexOf(substring) != -1) {
            count++;
            sb = sb.delete(0, sb.indexOf(substring) + substring.length());
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "раз, раз, раз, три";
        String str2 = "раз";

        System.out.println(numberOfRepeats(str1, str2));
    }
}
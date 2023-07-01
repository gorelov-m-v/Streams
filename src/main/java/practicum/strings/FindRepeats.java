package practicum.strings;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        String tempString = text;
        while(tempString.contains(substring)) {
            count++;
            int index = tempString.indexOf(substring) + substring.length();
            if (index <= tempString.length()) {
                tempString = tempString.substring(index);
            }
        }
        return count;
    }
}

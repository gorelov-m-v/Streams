package practicum.filebuffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.
        while (br.ready()) {
            String line = br.readLine();
            if (frequencyMap.get(line) == null) {
                frequencyMap.put(line, 1);
            } else {
                frequencyMap.put(line, frequencyMap.get(line) + 1);
            }
        }
        br.close();
        frequencyMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
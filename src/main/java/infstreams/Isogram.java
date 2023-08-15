package infstreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

class Isogram {

    public static boolean isIsogram(String word) {
        boolean result = Arrays.stream(word.chars().toArray()).allMatch(new HashSet<>()::add);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "tes";

        System.out.println(Arrays.stream(word.chars().toArray()).allMatch(new HashSet<>()::add));

    }
}
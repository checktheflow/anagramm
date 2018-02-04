package de.flo;

import java.util.stream.Collectors;

public class Anagramm {

    public boolean isAnagramm(String word1, String word2) {

        return sort(word1).equals(sort(word2));
    }

    private String sort(String s) {
        return s.toUpperCase().chars()
                .filter(c -> {
                    System.out.println(c);
                    return c != ' ';
                })
                .mapToObj(String::valueOf)
                .sorted()
                .collect(Collectors.joining());
    }
}

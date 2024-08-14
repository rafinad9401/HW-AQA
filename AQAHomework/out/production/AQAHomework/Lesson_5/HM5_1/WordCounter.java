package Lesson_5.HM5_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {

        String[] words = {
                "apple", "banana", "orange", "apple", "grape", "apple",
                "banana", "kiwi", "orange", "mango", "pineapple", "apple",
                "banana", "orange", "kiwi", "grape", "mango", "apple"
        };

        List<String> uniqueWords = new ArrayList<>();

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {

            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }

            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        System.out.println("Уникальные слова:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        System.out.println("\nКоличество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
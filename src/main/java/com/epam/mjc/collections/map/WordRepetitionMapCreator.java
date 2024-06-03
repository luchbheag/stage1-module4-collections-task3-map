package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> repetitionMap = new HashMap<>();
        if (sentence.isEmpty())
            return repetitionMap;
        for (String word : sentence.toLowerCase().replace(".", "").replace(",", "").split(" ")) {
            if (!repetitionMap.containsKey(word)) {
                repetitionMap.put(word, 1);
            } else {
                repetitionMap.put(word, repetitionMap.get(word) + 1);
            }
        }

        return repetitionMap;
    }
}

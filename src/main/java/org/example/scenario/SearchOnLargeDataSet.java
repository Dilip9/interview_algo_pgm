package org.example.scenario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SearchOnLargeDataSet {

    private Map<String, Set<Integer>> index = new HashMap<>();


    private void addDocument(int docId, String content){

        String[] words = content.split("\\s+");
        for(String word : words){
            index.computeIfAbsent(word, k -> new HashSet<>()).add(docId);
        }
    }

    public Set<Integer> search(String query){
        return index.getOrDefault(query, new HashSet<>());
    }
}

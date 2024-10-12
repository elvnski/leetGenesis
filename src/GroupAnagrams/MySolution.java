package GroupAnagrams;

import java.util.*;

public class MySolution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String s : strs) {

            char[] val = s.toCharArray();
            Arrays.sort(val);

            if (anagramMap.containsKey(Arrays.toString(val))) anagramMap.get(Arrays.toString(val)).add(s);
            else anagramMap.put(Arrays.toString(val), new ArrayList<>(List.of(s)));
        }

        return new ArrayList<>(anagramMap.values());
    }
}

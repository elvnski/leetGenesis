package TopKFrequentElements;

import java.util.*;

public class OptimizedSolution {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : nums) frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);

        List<List<Integer>> bucket = new ArrayList<>(nums.length + 1);
        for (int u = 0; u <= nums.length; u++) bucket.add(new ArrayList<>());

        for(int key : frequencyMap.keySet()) bucket.get(frequencyMap.get(key)).add(key);

        List<Integer> result = new ArrayList<>();
        for (int v = bucket.size() - 1; v >= 0 && result.size() < k; v--) result.addAll(bucket.get(v));

        return result.stream().mapToInt(i -> i).toArray();
    }
}

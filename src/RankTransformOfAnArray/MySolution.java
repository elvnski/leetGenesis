package RankTransformOfAnArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class MySolution {

    public int[] arrayRankTransform(int[] arr) {

        Map<Integer, Integer> rankMap = new HashMap<>();
        int [] sortedUniqueArray = Arrays.stream(arr).distinct().sorted().toArray();

        for (int u = 0; u < sortedUniqueArray.length; u++) rankMap.put(sortedUniqueArray[u], u+1);

        for (int v = 0; v < arr.length; v++) arr[v] = rankMap.get(arr[v]);

        return arr;
    }
}

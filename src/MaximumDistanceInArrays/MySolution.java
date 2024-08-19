package MaximumDistanceInArrays;

import java.util.*;

public class MySolution {

    public int maxDistance(List<List<Integer>> arrays) {


        int[] maxDistances = new int[arrays.size()];

        for(int u = 0; u < arrays.size(); u++) {

            int startElement = arrays.get(u).getFirst();

            int[] distancesArray = new int[arrays.size()];

            for (int v = 0; v < arrays.size(); v++) {

                if (u != v) {
                    int end = arrays.get(v).getLast();
                    System.out.println("Using end element: " + end + " of List: " + (v + 1));
                    distancesArray[v] = end - startElement;
                }
                else distancesArray[v] = 0;
            }

            System.out.println("Distances array for " + startElement + " from List " + u + " is: " + Arrays.toString(distancesArray));
            maxDistances[u] = Arrays.stream(distancesArray).max().getAsInt();
        }

        return  Arrays.stream(maxDistances).max().getAsInt();
    }

}

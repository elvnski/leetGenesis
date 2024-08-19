package MaximumDistanceInArrays;

import java.util.List;

public class OptimizedSolution {

    public int maxDistance(List<List<Integer>> arrays){

        int smallest = arrays.getFirst().getFirst();
        int largest = arrays.getFirst().getLast();

        int maxDistance = 0;

        for (int u = 1; u < arrays.size(); u++){

            //Getting the distance between the largest element of the current array and the current smallest overall
            maxDistance = Math.max(maxDistance, Math.abs(smallest - arrays.get(u).getLast()));
            
            //Getting the distance between the smallest element of the current array and the current largest overall
            maxDistance = Math.max(maxDistance, Math.abs(largest - arrays.get(u).getFirst()));

            System.out.println("Max Distance is now: " + maxDistance);

            //Updating the smallest value encountered
            smallest = Math.min(smallest, arrays.get(u).getFirst());
            System.out.println("Smallest is: " + smallest);

            //Updating the largest value encountered
            largest = Math.max(largest, arrays.get(u).getLast());
            System.out.println("Largest is: " + largest);
        }

        return maxDistance;
    }
}

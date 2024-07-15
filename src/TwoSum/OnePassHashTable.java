package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class OnePassHashTable {

    public int[] twoSum(int[] nums, int target) {

        //Initializing the number map
        Map<Integer, Integer> numberMap = new HashMap<>();
        int n = nums.length;

        //checking the numberMap for complements and adding numners tothe Hash table if no complement is found
        for (int x = 0; x < nums.length; x++){

            int complement = target - nums[x];

            if (numberMap.containsKey(complement))
                return new int[]{numberMap.get(complement), x};

            numberMap.put(nums[x], x);
        }

        return new int[]{};
    }
}
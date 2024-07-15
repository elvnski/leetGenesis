package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoPassHashTable {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numberMap = new HashMap<>();
        int n = nums.length;

        //Building the Hash Table
        for (int i = 0; i < n; i++){

            numberMap.put(nums[i], i);
        }

        //Finding the complementary number
        for (int num : nums) {

            int complement = target - num;
            if (numberMap.containsKey(complement))
                return new int[]{numberMap.get(complement), num};
        }

        return new int[]{};
    }
}

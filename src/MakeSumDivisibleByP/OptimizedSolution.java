package MakeSumDivisibleByP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimizedSolution {

    public int minSubarray(int[] nums, int p) {

        int numsLength = nums.length;
        int minLength = numsLength; // Stores length of the smallest subarray to remove
        int remainder = (int) (Arrays.stream(nums).asLongStream().sum() % p); // This is the remainder of total sum % p

        // HashMap for storing prefixSum modulo p and their indices in nums
        Map<Integer, Integer> prefixSumMod = new HashMap<>();
        prefixSumMod.put(0, -1);

        int currentMod = 0; // Stores the running prefix sum
        for (int u = 0; u < numsLength; u++) {

            currentMod = (currentMod + nums[u]) % p;
            prefixSumMod.put(currentMod, u);

            int target = (currentMod - remainder + p) % p;

            if (prefixSumMod.containsKey(target)) {

                minLength = Math.min(minLength, u - prefixSumMod.get(target));
            }
        }

        return minLength < numsLength ? minLength : -1;
    }
}

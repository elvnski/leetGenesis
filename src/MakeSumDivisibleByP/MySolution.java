package MakeSumDivisibleByP;

import java.util.Arrays;
import java.util.HashMap;

public class MySolution {

    public int minSubarray(int[] nums, int p) {

        int numsLength = nums.length;
        long numsSum = Arrays.stream(nums).asLongStream().sum();
        int remainder  = (int) (numsSum % p);

        if (remainder == 0) return 0;

        HashMap<Integer, Integer> prefixModMap = new HashMap<>();
        prefixModMap.put(0, -1);

        long prefixSum = 0;
        int minLength = numsLength;

        for (int u = 0; u < numsLength; u++) {

            prefixSum += nums[u];

            int currentMod = (int)(prefixSum % p);
            int target = (currentMod - remainder + p) % p;

            if (prefixModMap.containsKey(target)){

                minLength = Math.min(minLength, u - prefixModMap.get(target));
            }

            prefixModMap.put(currentMod, u);
        }

        return minLength == numsLength ? -1 : minLength;
    }
}

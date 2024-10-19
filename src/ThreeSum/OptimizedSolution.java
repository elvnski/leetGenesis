package ThreeSum;

import java.util.*;

public class OptimizedSolution {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> threeSums = new ArrayList<>();

        for (int u = 0; u < nums.length; u++){

            if ( u > 0 && nums[u] == nums[u-1]) continue;

            int left = u + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[left] + nums[u] + nums[right];

                if (sum == 0) {

                    threeSums.add(Arrays.asList(nums[left], nums[u], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) left++;
                else right--;
            }
        }

        return threeSums;
    }
}

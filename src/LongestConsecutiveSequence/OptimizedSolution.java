package LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class OptimizedSolution {

    public int longestConsecutive(int[] nums) {

        if(nums == null || nums.length == 0) return 0;

        Set<Integer> numsSet = new HashSet<>();

        for (int no : nums) numsSet.add(no);

        int longest = 0;

        for(int no : nums) {

            int left = no - 1;
            int right = no + 1;

            while(numsSet.remove(left)) left--;
            while(numsSet.remove(right)) right++;

            longest = Math.max(longest, right - left -1);

            if(numsSet.isEmpty()) return longest;
        }

        return longest;
    }
}

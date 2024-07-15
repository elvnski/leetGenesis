package TwoSum;

import java.util.Arrays;

public class TwoSumSolutions {

    public void solve(int[] nums, int target){


        BruteForce bruteForceTwoSum = new BruteForce();
        System.out.print("BRUTE FORCE SOLUTION: ");
        System.out.println(Arrays.toString(bruteForceTwoSum.twoSum(nums, target)));

        TwoPassHashTable twoPassHashTableTwoSum = new TwoPassHashTable();
        System.out.print("TWO PASS HASH TABLE SOLUTION: ");
        System.out.println(Arrays.toString(twoPassHashTableTwoSum.twoSum(nums, target)));

        OnePassHashTable onePassHashTableTwoSum = new OnePassHashTable();
        System.out.print("ONE PASS HASH TABLE SOLUTION: ");
        System.out.println(Arrays.toString(onePassHashTableTwoSum.twoSum(nums, target)));


    }
}

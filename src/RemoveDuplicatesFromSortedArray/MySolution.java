package RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class MySolution {



    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int u = 0; // Pointer for the position of the last unique element

        System.out.println("Original Nums: " + Arrays.toString(nums));

        for (int v = 1; v < nums.length; v++) {
            if (nums[v] != nums[u]) { // Found a new unique element
                u++;
                nums[u] = nums[v]; // Move it to the next unique position

                System.out.println("Rearranged Nums: " + Arrays.toString(nums));
            }
        }

        System.out.println("Modified Nums: " + Arrays.toString(nums));

        // The length of the unique portion of the array
        return u + 1;
    }
}



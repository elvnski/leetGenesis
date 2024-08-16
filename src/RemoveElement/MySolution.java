package RemoveElement;

import java.util.Arrays;

public class MySolution {

    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) return 0;

        int u = 0;

        System.out.println("val: " + val);
        System.out.println("Original Nums: " + Arrays.toString(nums));

        for (int v = 0; v < nums.length; v++){

            if (nums[v] != val){

                nums[u] = nums[v];
                u++;

                System.out.println("Rearranged Nums: " + Arrays.toString(nums));
            }
        }

        return u;
    }


    public int removeElementV2(int[] nums, int val) {

        if (nums.length == 0) return 0;

        int u = -1;
        int k = 0;

        System.out.println("Original Nums: " + Arrays.toString(nums));

        for (int v = 0; v < nums.length; v++){

            if (nums[v] == val){

                k++;
                System.out.println("Found " + val + " at index: " + v);
                u = v;
            }

            if (nums[v] != val && u != -1){

                nums[u] = nums[v];
                u = -1;

                System.out.println("Replaced with " + nums[v]);
            }
        }

        System.out.println("Rearranged Nums: " + Arrays.toString(nums));
        return nums.length - k;
    }



    public int removeElementV3(int[] nums, int val) {

        if (nums.length == 0) return 0;
        if (nums.length == 1 && nums[0] == val) return 0;

        int endIndex = nums.length - 1;

        System.out.println("Original Nums: " + Arrays.toString(nums));

        for (int v = 0; v < nums.length; v++){

            if (v == endIndex) return endIndex + 1;

            if (nums[v] == val && v+1 < nums.length){

                System.out.println("Found " + val + " at index: " + v);

                int temp = nums[v];

                while (nums[endIndex] == val) {

                    endIndex--;
                    System.out.println("endIndex is now at: " + endIndex);
                    if (endIndex == 0) return 0;
                }

                nums[v] = nums[endIndex];
                nums[endIndex] = temp;
                endIndex--;

                System.out.println("Rearranged Nums: " + Arrays.toString(nums));
            }
        }

        System.out.println("Endindex: " + endIndex);
        return endIndex + 1;
    }

}

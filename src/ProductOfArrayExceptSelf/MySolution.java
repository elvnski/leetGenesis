package ProductOfArrayExceptSelf;

import java.util.ArrayList;
import java.util.List;

public class MySolution {

    public int[] productExceptSelf(int[] nums) {

        int[] productArray = new int[nums.length];

        for (int u = 0; u< nums.length; u++){

            int temp = nums[u];

            nums[u] = 1;

            int product = 1;

            for (int n : nums) product *= n;

            productArray[u] = product;

            nums[u] = temp;
        }


        return productArray;
    }

}

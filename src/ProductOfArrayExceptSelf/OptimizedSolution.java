package ProductOfArrayExceptSelf;

public class OptimizedSolution {

    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] product = new int[length];

        product[0] = 1;

        for (int u = 1; u < length; u++) product[u] = product[u-1] * nums[u-1];

        int right = 1;

        for(int v = length-1; v >= 0; v--){

            product[v] *= right;
            right *= nums[v];
        }

        return product;
    }
}

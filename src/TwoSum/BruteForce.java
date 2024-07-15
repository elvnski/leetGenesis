package TwoSum;

public class BruteForce {

    public int[] twoSum(int[] nums, int target) {

        int[] twoSum = new int[2];

        if(nums.length < 2 || nums.length > 10000 || target < -1000000000 || target > 1000000000)
            return new int[]{0,0};


        // Looping from the first element of the array
        for(int i = 0; i < nums.length; i++){

            if(Math.pow(-10, 9) >= nums[i] && nums[i] >= Math.pow(10, 9)) continue;

//            System.out.println("Testing nums[" + i + "] = " + nums[i]);

            //Looping from the second element of the array and summing with the first
            for(int j = i+1; j < nums.length; j++){

//                System.out.println("Testing nums[" + i + "] = " + nums[i] + " and nums[" + j + "] = " + nums[j]);

                //if the two add up to the target and the index isn't equal then we returnthe twoSum array
                if(nums[i] + nums[j] == target && i != j) {

                    twoSum[0] = i;
                    twoSum[1] = j;

//                    System.out.println("Found nums[" + i + "] = " + nums[i] + " + nums[" + j + "] = " + nums[j] + " which equal target = " + target);
                    return twoSum;
                }
            }
        }

        return twoSum;
    }

}

package ContainerWithMostWater;

import java.util.Arrays;

public class MySolution {

    public int maxArea(int[] height) {

        if (height.length == 2) return Math.min(height[0], height[1]);

        int maxArea = 0;

        int left = 0, right = height.length - 1;

        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }


    public int maxAreaVerbose(int[] height) {


        System.out.println("HEIGHT : " + Arrays.toString(height));

        if (height.length == 2) return Math.min(height[0], height[1]);

        int maxArea = 0;


        int left = 0, right = height.length - 1;

        while (left < right) {

            System.out.println("\nUsing left = " + left + ", right = " + right);

            System.out.println("Height = " + Math.min(height[left], height[right]) + ", Width = " + (right - left));
            int area = Math.min(height[left], height[right]) * (right - left);

            System.out.println("Area = " + area);


            maxArea = Math.max(maxArea, area);
            System.out.println("maxArea is now: " + maxArea);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }

}
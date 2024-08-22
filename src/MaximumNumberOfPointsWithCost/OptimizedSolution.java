package MaximumNumberOfPointsWithCost;

import java.util.Arrays;

public class OptimizedSolution {

    public long maxPoints(int[][] points) {
        
        int rows = points.length; // Number of rows
        int cols = points[0].length; // Number of Columns

        // Initialize dp with the values from the first row
        long[] dp = new long[cols];
        for (int c = 0; c < cols; c++) dp[c] = points[0][c];

        // Traverse each row starting from the second row
        for (int r = 1; r < rows; r++){

            System.out.println("\nROW: " + r);
            System.out.println("dp: " + Arrays.toString(dp));

            // STEP 1: Compute leftMax
            long[] leftMax = new long[cols];
            leftMax[0] = dp[0];
            for (int c = 1; c < cols; c++) leftMax[c] = Math.max(leftMax[c-1] - 1, dp[c]);

            System.out.println("leftMax: " + Arrays.toString(leftMax));


            //STEP 2: Compute rigthMax
            long[] rightMax = new long[cols];
            rightMax[cols-1] = dp[cols-1];
            for (int c = cols-2; c >= 0; c--) rightMax[c] = Math.max(rightMax[c+1] - 1, dp[c]);

            System.out.println("rightMax: " + Arrays.toString(rightMax));


            // STEP 3: Calculate New dp for the Current Row
            long[] newDp = new long[cols];
            for (int c = 0; c < cols; c++) newDp[c] = points[r][c] + Math.max(leftMax[c], rightMax[c]);

            System.out.println("newDp: " + Arrays.toString(newDp));

            // Update dp to the new values for the next row
            dp = newDp;
        }

        // The answer is the maximum value in the last dp array

        long maxPoints = 0;

        for (long val : dp) maxPoints = Math.max(maxPoints, val);

        return maxPoints;
    }

}

package LongestCommonPrefix;

import java.util.Arrays;

public class OptimizedSolution {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder();

        //Sorting the array alphabetically to ensure all prefixed are sorted
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        //Looping with limit of the shorter string length btwn first and last
        for (int k = 0; k < Math.min(first.length(), last.length()); k++){

            //if the characters at k-th don't match then we stop the loop
            if (first.charAt(k) != last.charAt(k)) return ans.toString();
            //otherwise we append the character to ans
            ans.append(first.charAt(k));
        }

        return ans.toString();
    }

}

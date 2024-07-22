package LongestCommonPrefix;

public class LongestCommonPrefixSolutions {

    public void solve(String[] strs){

        System.out.print("MY SOLUTION: ");
        System.out.println((new MySolution()).longestCommonPrefix(strs));

        System.out.print("OPTIMIZED SOLUTION: ");
        System.out.println((new OptimizedSolution()).longestCommonPrefix(strs));
    }

}

import PalindromeNumber.PalindromeNumberSolutions;
import TwoSum.BruteForce;
import TwoSum.TwoPassHashTable;
import TwoSum.TwoSumSolutions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //LEETCODE 1: TWO SUM
        System.out.println("LEETCODE #1: TWO SUM");
        TwoSumSolutions twoSumSolutions = new TwoSumSolutions();
        twoSumSolutions.solve(new int[]{0,4,3,0}, 0);


        System.out.println("\nLEETCODE #9: PALINDROME NUMBER");
        PalindromeNumberSolutions palindromeNumberSolutions = new PalindromeNumberSolutions();
        palindromeNumberSolutions.solve(757);


    }
}
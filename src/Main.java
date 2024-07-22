import LongestCommonPrefix.LongestCommonPrefixSolutions;
import PalindromeNumber.PalindromeNumberSolutions;
import RomanToInteger.RomanToIntegerSolutions;
import TwoSum.BruteForce;
import TwoSum.TwoPassHashTable;
import TwoSum.TwoSumSolutions;
import ValidParentheses.MySolution;
import ValidParentheses.ValidParenthesesSolutions;

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


        System.out.println("\nLEETCODE #13: ROMAN TO INTEGER");
        RomanToIntegerSolutions romanToIntegerSolutions = new RomanToIntegerSolutions();
        romanToIntegerSolutions.solve("MCMXCIV");


        System.out.println("\nLEETCODE #14: LONGEST COMMON PREFIX");
        LongestCommonPrefixSolutions longestCommonPrefixSolutions = new LongestCommonPrefixSolutions();
        longestCommonPrefixSolutions.solve(new String[]{"a", "aaa", "aba", "aaaaac"});


        System.out.println("\nLEETCODE #20: VALID PARENTHESES");
        (new ValidParenthesesSolutions()).solve("(){}}{");

    }
}
import LongestCommonPrefix.LongestCommonPrefixSolutions;
import MaximumDistanceInArrays.OptimizedSolution;
import MergeTwoSortedLists.ListNode;
import MergeTwoSortedLists.MySolution;
import PalindromeNumber.PalindromeNumberSolutions;
import RomanToInteger.RomanToIntegerSolutions;
import TwoSum.BruteForce;
import TwoSum.TwoPassHashTable;
import TwoSum.TwoSumSolutions;
import ValidParentheses.ValidParenthesesSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        System.out.println("\nLEETCODE #21: MERGE TWO SORTED LISTS");
        ListNode listNode1 = new ListNode(1, new ListNode(3, new ListNode(7, new ListNode(15, new ListNode(27)))));
        ListNode listNode2 = new ListNode(8, new ListNode(14, new ListNode(23, new ListNode(35, new ListNode(47)))));
        System.out.println("ListNode 1: " + listNode1.toString());
        System.out.println("ListNode 2: " + listNode2.toString());
        System.out.println("Merged List: " + (new MySolution()).mergeTwoLists(listNode1, listNode2).toString());


        System.out.println("\nLEETCODE #26: REMOVE DUPLICATES FROM SORTED ARRAY");
        int[] inputArray = new int[]{1,1,1,1,2,2,2,2,2,2,2,2,2,3};
        int[] nums = {
                1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
                6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
                11, 11, 12, 12, 13, 13, 14, 14, 15, 15,
                16, 16, 17, 17, 18, 18, 19, 19, 20, 20,
                21, 21, 22, 22, 23, 23, 24, 24, 25, 25,
                26, 26, 27, 27, 28, 28, 29, 29, 30, 30,
                31, 31, 32, 32, 33, 33, 34, 34, 35, 35,
                36, 36, 37, 37, 38, 38, 39, 39, 40, 40,
                41, 41, 42, 42, 43, 43, 44, 44, 45, 45,
                46, 46, 47, 47, 48, 48, 49, 49, 50, 50
        };
        int[] nums2 = {1,2};
        System.out.println("K = " + new RemoveDuplicatesFromSortedArray.MySolution().removeDuplicates(nums));


        System.out.println("\nLEETCODE #27: REMOVE ELEMENT");
        int[] inputArray2 = new int[]{3,2,2,3};
        int[] inputArray3 = new int[]{0,1,2,2,3,0,4,2};
        int[] inputArray4 = new int[]{3,3};
        System.out.println("K = " + new RemoveElement.MySolution().removeElement(inputArray3, 3));


        System.out.println("\nLEETCODE #624: MAXIMUM DISTANCE IN ARRAYS");
        List<List<Integer>> listOfLists = new ArrayList<>();

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);
        List<Integer> list3 = Arrays.asList(1, 2, 3);

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println("Maximum distance in arrays is: " + new OptimizedSolution().maxDistance(listOfLists));



        System.out.println("\nLEETCODE #1937: MAXIMUM NUMBER OF POINTS WITH COST");

        int[][] points = {
                {5,2,1,2},
                {2,1,5,2},
                {5,5,5,0}
        };
        System.out.println("\n\nMaximum Points Achievable: " + new MaximumNumberOfPointsWithCost.OptimizedSolution().maxPoints(points));  // Output should be 9

    }
}
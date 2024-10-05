import InvertBinaryTree.TreeNode;
import LongestCommonPrefix.LongestCommonPrefixSolutions;
import MergeTwoSortedLists.ListNode;
import MergeTwoSortedLists.MySolution;
import MyCalendarTwo.MyCalendarTwo;
import NaryTreePostorderTraversal.Node;
import NaryTreePostorderTraversal.OptimizedSolution;
import PalindromeNumber.PalindromeNumberSolutions;
import RomanToInteger.RomanToIntegerSolutions;
import TwoSum.TwoSumSolutions;
import ValidParentheses.ValidParenthesesSolutions;
import com.sun.source.tree.Tree;

import java.util.*;

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

        System.out.println("Maximum distance in arrays is: " + new MaximumDistanceInArrays.OptimizedSolution().maxDistance(listOfLists));



        System.out.println("\nLEETCODE #1937: MAXIMUM NUMBER OF POINTS WITH COST");

        int[][] points = {
                {5,2,1,2},
                {2,1,5,2},
                {5,5,5,0}
        };
        System.out.println("\n\nMaximum Points Achievable: " + new MaximumNumberOfPointsWithCost.OptimizedSolution().maxPoints(points));  // Output should be 9



        System.out.println("\nLEETCODE #476: NUMBER COMPLEMENT");

        int num = 234;
        System.out.println("Finding Number Complement of: " + num);
        System.out.println("My Solution's Complement: " + new NumberComplement.MySolution().findComplement(num));
        System.out.println("Optimized Solution's Complement: " + new NumberComplement.OptimizedSolution().findComplement(num));


        System.out.println("\nLEETCODE #590: N-ARY TREE POSTORDER TRAVERSAL");

        Node node5 = new Node(5);
        Node node6 = new Node(6);

        Node node3 = new Node(3, Arrays.asList(node5, node6));

        Node node2 = new Node(2);
        Node node4 = new Node(4);

        Node root = new Node(1, Arrays.asList(node3, node2, node4));

        System.out.println("root : " + root.toString());
        System.out.println("Postorder Traversal: " + new OptimizedSolution().postorder(root));




        System.out.println("\nLEETCODE #1514: PATH WITH MAXIMUM PROBABILITY");

        int n = 10;
        int[][] edges = {
                {0, 1}, {0, 2}, {0, 3}, {1, 4}, {2, 4},
                {3, 5}, {4, 6}, {5, 6}, {4, 7}, {6, 8},
                {7, 8}, {8, 9}, {1, 9}, {3, 9}, {2, 8},
                {4, 5}, {5, 7}, {2, 7}, {3, 6}, {6, 9}
        };
        double[] succProb = {
                0.5, 0.4, 0.3, 0.6, 0.7,
                0.2, 0.9, 0.8, 0.5, 0.3,
                0.4, 0.6, 0.1, 0.7, 0.5,
                0.9, 0.2, 0.6, 0.3, 0.8
        };
        int start_node = 0;
        int end_node = 9;

        System.out.println("Djisktra's Algorithm");
        System.out.println("Maximum Probability for path " + start_node + " -> " + end_node + ": " + new PathWithMaximumProbability.DjisktrasAlgorithmSolution().maxProbability(n, edges, succProb, start_node, end_node));

        System.out.println("\nBellman-Ford Algorithm");
        System.out.println("Maximum Probability for path " + start_node + " -> " + end_node + ": " + new PathWithMaximumProbability.BellmanFordAlgorithmSolution().maxProbability(n, edges, succProb, start_node, end_node));




        System.out.println("\nLEETCODE #1945: SUM OF DIGITS OF STRING AFTER CONVERT");

        System.out.println("\nMy Solution: " + new SumOfDigitsOfStringAfterConvert.MySolution().getLucky("zbax", 2));
        System.out.println("Optimized Solution: " + new SumOfDigitsOfStringAfterConvert.OptimizedSolution().getLucky("", 2));



        System.out.println("\nLEETCODE #226: INVERT BINARY TREE");
        TreeNode tree = new TreeNode(4,
                new TreeNode(2,
                    new TreeNode(1), new TreeNode(3)),
                new TreeNode(7,
                    new TreeNode(6), new TreeNode(9))
        );

        System.out.println("Inverted tree: \n" + new InvertBinaryTree.OptimizedSolution().invertTree(tree));


        System.out.println("\nLEETCODE #420: STRONG PASSWORD CHECKER");

        String password = "iojqw93121rrrrreiA";
        System.out.println("Checking [password]: " + password);

        System.out.println("Minimum Steps: " + new StrongPasswordChecker.OptimizedSolution().strongPasswordChecker(password));

        System.out.println("\n------- VERBOSE -------\n");
        new StrongPasswordChecker.OptimizedSolution().strongPasswordCheckerVerbose(password);



        System.out.println("\nLEETCODE #731: MY CALENDAR II");

        int[][] bookingDates = {{10,20},{50,60},{10,40},{5,15},{5,10},{25,55}};

        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        for(int[] date : bookingDates) System.out.println("BOOKING [" + date[0] + ',' + date[1] + "]? " + myCalendarTwo.book(date[0], date[1]));

        MyCalendarTwo myCalendarTwoVerbose = new MyCalendarTwo();
        System.out.println("\n\n----------- VERBOSE OUTPUT -----------");
        for(int[] date : bookingDates) System.out.println("\nBOOKING [" + date[0] + ',' + date[1] + "]? " + myCalendarTwoVerbose.bookVerbose(date[0], date[1]) + "\n\n*** *** ***\n");



        System.out.println("\nLEETCODE #1331: RANK TRANSFORM OF AN ARRAY");

        int[] originalArray = new int[]{40,10,20,30};
        int[] rankArray = new RankTransformOfAnArray.MySolution().arrayRankTransform(originalArray);

        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(rankArray));

    }
}
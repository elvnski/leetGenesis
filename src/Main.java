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
        System.out.println("\nLEETCODE #420: Strong Password Checker");

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



        System.out.println("\n\nLEETCODE #2508: ADD EDGES TO MAKE DEGREES OF ALL NODES EVEN");

        List<List<Integer>> edgesList = new ArrayList<>();

        // TEST CASE 1
//        int nodesCount = 5;
//        edgesList.add(Arrays.asList(1,2));
//        edgesList.add(Arrays.asList(2,3));
//        edgesList.add(Arrays.asList(3,4));
//        edgesList.add(Arrays.asList(4,2));
//        edgesList.add(Arrays.asList(1,4));
//        edgesList.add(Arrays.asList(2,5));

//        // TEST CASE 2
//        int nodesCount = 4;
//        edgesList.add(Arrays.asList(1,2));
//        edgesList.add(Arrays.asList(1,3));
//        edgesList.add(Arrays.asList(1,4));

        // TEST CASE 3
//        int nodesCount = 4;
//        edgesList.add(Arrays.asList(1,2));
//        edgesList.add(Arrays.asList(2,3));
//        edgesList.add(Arrays.asList(2,4));
//        edgesList.add(Arrays.asList(3,4));


        int[][] edgesArray = {
                {2, 19}, {16, 17}, {8, 14}, {2, 16}, {12, 20}, {12, 14}, {16, 18},
                {15, 16}, {10, 21}, {3, 5}, {13, 18}, {17, 20}, {14, 17}, {9, 12},
                {5, 15}, {5, 6}, {3, 7}, {2, 21}, {10, 13}, {8, 16}, {7, 18}, {4, 6},
                {9, 1}, {13, 21}, {18, 20}, {7, 14}, {4, 19}, {5, 8}, {3, 11}, {11, 1},
                {7, 12}, {4, 7}, {3, 16}, {13, 17}, {17, 19}, {9, 13}, {7, 19}, {10, 16},
                {4, 13}, {4, 5}, {2, 15}, {12, 19}, {11, 16}, {2, 9}, {11, 17}, {17, 1},
                {16, 21}, {4, 10}, {10, 14}, {14, 16}, {4, 1}, {13, 20}, {5, 20}, {4, 14},
                {4, 21}, {10, 20}, {2, 14}, {8, 15}, {4, 8}, {6, 19}, {15, 1}, {19, 1},
                {8, 19}, {15, 21}, {3, 12}, {11, 18}, {9, 17}, {18, 19}, {7, 21}, {3, 21},
                {16, 19}, {11, 15}, {5, 1}, {8, 17}, {3, 15}, {8, 1}, {10, 19}, {3, 8},
                {6, 16}, {2, 8}, {5, 18}, {11, 13}, {11, 20}, {14, 21}, {6, 20}, {4, 20},
                {12, 13}, {5, 12}, {10, 11}, {9, 15}, {3, 19}, {9, 20}, {14, 18}, {21, 1},
                {13, 19}, {8, 21}, {2, 13}, {3, 10}, {9, 18}, {19, 21}, {6, 7}, {3, 18},
                {2, 18}, {6, 14}, {3, 17}, {5, 21}, {14, 20}, {8, 9}, {16, 1}, {3, 4},
                {13, 1}, {5, 9}, {4, 15}, {17, 21}, {20, 21}, {2, 17}, {13, 14}, {11, 14},
                {9, 16}, {10, 18}, {6, 15}, {6, 12}, {3, 13}, {5, 11}, {6, 1}, {12, 17},
                {8, 10}, {5, 10}, {8, 18}, {4, 12}, {10, 1}, {6, 13}, {4, 18}, {7, 20},
                {7, 16}, {2, 6}, {12, 21}, {4, 17}, {15, 18}, {13, 16}, {15, 20}, {7, 10},
                {6, 10}, {2, 20}, {7, 15}, {18, 1}, {12, 1}, {3, 20}, {7, 1}, {14, 15},
                {4, 9}, {11, 19}, {7, 9}, {5, 17}, {18, 21}, {6, 21}, {8, 11}, {6, 17},
                {3, 14}, {7, 11}, {5, 7}, {7, 13}, {6, 8}, {6, 9}, {10, 12}, {5, 16},
                {2, 4}, {17, 18}, {9, 11}, {12, 16}, {3, 6}, {12, 18}, {3, 9}, {11, 12},
                {14, 19}, {10, 15}, {5, 13}, {8, 13}, {15, 17}, {2, 10}, {11, 21}, {20, 1},
                {6, 18}, {2, 12}, {19, 20}, {6, 11}, {8, 12}, {2, 3}, {12, 15}, {2, 11},
                {9, 10}, {7, 17}, {9, 19}, {13, 15}, {7, 8}, {4, 11}, {2, 5}, {5, 19},
                {16, 20}, {15, 19}, {9, 14}, {14, 1}, {10, 17}, {9, 21}, {2, 7}, {8, 20},
                {5, 14}, {4, 16}
        };

        int nodesCount = 21;
        for (int[] edge : edgesArray) edgesList.add(Arrays.asList(edge[0], edge[1]));


        // TEST CASE 4
//        int[][] edgesArray = new TestCase42().getEdgesArray();
//        int nodesCount = 49123;
//        for (int[] edge : edgesArray) edgesList.add(Arrays.asList(edge[0], edge[1]));


        boolean addEdgesToMakeDegreesOfAllNodesEven = new AddEdgesToMakeDegreesOfAllNodesEven.MySolution().isPossible(nodesCount, edgesList);

        System.out.println("Nodes Count: " + nodesCount);
        System.out.println("\nIs it Possible: " + addEdgesToMakeDegreesOfAllNodesEven);


        System.out.println("\n\nLEETCODE #2696: MINIMUM STRING LENGTH AFTER REMOVING SUBSTRINGS");

        System.out.println("Minimum String Length After Removing Substrings: " + new MinimumStringLengthAfterRemovingSubStrings.MySolution().minLength("ABFCACDB"));

        System.out.println("\n\n----------------- MINLENGTH VERBOSE -----------------");
        System.out.println("Minimum String Length After Removing Substrings: " + new MinimumStringLengthAfterRemovingSubStrings.OptimizedSolution().minLengthVerbose("ABFCACDB"));



        System.out.println("\n\nLEETCODE #1590: MAKE SUM DIVISIBLE BY P");

        int[] numsArray = new int[]{6,3,5,2};
        int p = 9;
        System.out.println("MY SOLUTION \nSub Array Length needed to Make Sum Divisible by P: " + new MakeSumDivisibleByP.MySolution().minSubarray(numsArray, p));

        System.out.println("OPTIMIZED SOLUTION \nSub Array Length needed to Make Sum Divisible by P: " + new MakeSumDivisibleByP.OptimizedSolution().minSubarray(numsArray, p));


        System.out.println("\n\nLEETCODE #217: CONTAINS DUPLICATE");
        int[] numsArray2 = new int[]{1,1,1,3,3,4,3,2,4,2};

        System.out.println("Contains Duplicate? : " + new ContainsDuplicate.MySolution().containsDuplicate(numsArray2));



        System.out.println("\n\nLEETCODE #242: VALID ANAGRAM");

        String s = "rat", t = "car";
        System.out.println("Valid Anagram [" + s + ", " + t + "]? " + new ValidAnagram.MySolution().isAnagram(s, t));


        System.out.println("\n\nLEETCODE #49: GROUP ANAGRAMS");

        String[] strs = new String[]{"a"};
        System.out.println("Group Anagrams: " + new GroupAnagrams.MySolution().groupAnagrams(strs));



        System.out.println("\n\nLEETCODE #347: TOP K FREQUENT ELEMENTS");

        int[] elements = new int[]{1,1,1,2,2,3};
        int topK = 2;

        System.out.println("Top K frequent elements: " + Arrays.toString(new TopKFrequentElements.OptimizedSolution().topKFrequent(elements, topK)));


    }
}
package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class OptimizedSolution {

    public int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) return 0;

        HashMap<Character, Integer> uniquesMap = new HashMap<>();
        int maxUnique = 0;

        for (int right = 0, left = 0; right < s.length(); right++){

            if (uniquesMap.containsKey(s.charAt(right)))
                left = Math.max(left, uniquesMap.get(s.charAt(right)) + 1);

            uniquesMap.put(s.charAt(right), right);

            maxUnique = Math.max(maxUnique, right - left + 1);
        }

        return maxUnique;
    }


    public int lengthOfLongestSubstringVerbose(String s) {

        if (s.isEmpty()) return 0;

        HashMap<Character, Integer> uniquesMap = new HashMap<>();
        int maxUnique = 0;

        for (int right = 0, left = 0; right < s.length(); right++){

            System.out.println("\n");

            if (uniquesMap.containsKey(s.charAt(right))) {

                System.out.println("Found " + s.charAt(right) + " again at index " + right);

                left = Math.max(left, uniquesMap.get(s.charAt(right)) + 1);

                System.out.println("Moved the left pointer to index " + left);
            }

            uniquesMap.put(s.charAt(right), right);
            System.out.println("Added Character at index " + right);

            System.out.println("Uniques Map is now " + uniquesMap);
            System.out.println("right = " + right + ", left = " + left);

            maxUnique = Math.max(maxUnique, right - left + 1);
        }

        return maxUnique;
    }

}

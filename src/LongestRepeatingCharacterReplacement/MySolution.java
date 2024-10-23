package LongestRepeatingCharacterReplacement;

import java.util.HashMap;
import java.util.Map;

public class MySolution {

    public int characterReplacement(String s, int k) {

        int maxLength = 0;
        int maxCount = 0;
        int left = 0;

        Map<Character, Integer> countMap = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            countMap.put(rightChar, countMap.getOrDefault(rightChar, 0) + 1);

            maxCount = Math.max(maxCount, countMap.get(rightChar));

            while (right - left + 1 - maxCount > k) {

                char leftChar = s.charAt(left);

                countMap.put(leftChar, countMap.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

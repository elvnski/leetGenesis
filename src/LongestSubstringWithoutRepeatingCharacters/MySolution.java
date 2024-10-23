package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class MySolution {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> uniqueSet = new HashSet<>();

        int maxUnique = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){

            if(!uniqueSet.contains(s.charAt(right))){

                uniqueSet.add(s.charAt(right));
                maxUnique = Math.max(maxUnique, right - left + 1);
            }
            else {

                while(uniqueSet.contains(s.charAt(right))){

                    uniqueSet.remove(s.charAt(left));
                    left++;
                }

                uniqueSet.add(s.charAt(right));
            }
        }

        return maxUnique;
    }
}

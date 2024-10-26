package MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class MySolution {

    public String minWindow(String s, String t) {

        if (s == null || t == null || s.isEmpty() || t.isEmpty() || s.length() < t.length()) return "";

        int count = 0;
        int left = 0;
        int minLength = s.length() + 1;
        int startIndex = 0;

        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : t.toCharArray()) charMap.put(c, charMap.getOrDefault(c, 0) + 1);

        for (int right = 0; right < s.length(); right++){

            if (charMap.containsKey(s.charAt(right))){

                char rightChar = s.charAt(right);

                charMap.put(rightChar, charMap.get(rightChar) - 1);
                if (charMap.get(rightChar) >= 0) count++;

                while (count == t.length()) {

                    if (right - left + 1 < minLength) {

                        startIndex = left;
                        minLength = right - left + 1;
                    }

                    char leftChar = s.charAt(left);
                    if (charMap.containsKey(leftChar)) {

                        charMap.put(leftChar, charMap.get(leftChar) + 1);
                        if (charMap.get(leftChar) > 0) count--;
                    }

                    left++;
                }
            }
        }

        if (minLength > s.length()) return "";

        return s.substring(startIndex, startIndex + minLength);
    }

}

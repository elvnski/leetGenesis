package MinimumWindowSubstring;

public class OptimizedSolution {

    public String minWindow(String s, String t){

        // Tracks a-z & A-Z in unicode ie.65-90 & 97-122
        int[] tElements = new int[123];

        for (char c: t.toCharArray()) tElements[c]++;

        char[] sArray = s.toCharArray();
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int toFind = t.length();
        int left = 0, right = 0;

        while (right < s.length()){

            if (tElements[sArray[right]] > 0) toFind--;

            tElements[sArray[right]]--;
            right++;

            while (toFind == 0) {

                if (right - left < minLength) {

                    start = left;
                    minLength = right - left;
                }

                if (tElements[sArray[left]] == 0) toFind++;
                tElements[sArray[left]]++;
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) return "";

        return s.substring(start, start + minLength);
    }
}

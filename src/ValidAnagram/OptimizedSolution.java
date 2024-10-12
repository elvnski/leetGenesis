package ValidAnagram;

import java.util.Arrays;

public class OptimizedSolution {

    public boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

}

package LongestCommonPrefix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MySolution {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder longestPrefix = new StringBuilder();
        String initialString = strs[0];

        if (strs[0].isEmpty()) return "";

        Set<String> strsSet = new HashSet<>(Arrays.asList(strs));

        if (strsSet.size() == 1) return strsSet.toArray(new String[0])[0];

        int addToSet = 1;

        outerLoop:
        for (int x = 0; x < initialString.length(); x++){

            for(String item : strsSet){

                if (item.equals(initialString)) continue;
                if (x >= item.length()) break outerLoop;

                if (item.charAt(x) != initialString.charAt(x)){
                    addToSet *= 0;
                }
            }

            if(addToSet == 1) longestPrefix.append(initialString.charAt(x));
            else break outerLoop;
        }

        return longestPrefix.toString();
    }

}

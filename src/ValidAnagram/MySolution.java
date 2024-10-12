package ValidAnagram;

import java.util.ArrayList;
import java.util.List;

public class MySolution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        List<Character> sChars = new ArrayList<>();

        for(char c : s.toCharArray()) sChars.add(c);
        for(char d : t.toCharArray()) if(sChars.contains(d)) sChars.remove(sChars.indexOf(d));

        return sChars.isEmpty();
    }
}

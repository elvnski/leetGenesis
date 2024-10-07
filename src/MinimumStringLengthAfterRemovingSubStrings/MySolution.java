package MinimumStringLengthAfterRemovingSubStrings;

public class MySolution {

    public int minLength(String s) {

        if (!s.contains("AB") && !s.contains("CD")) return s.length();

        while (s.contains("AB")) s = s.replace("AB", "");
        while (s.contains("CD")) s = s.replace("CD", "");

        return minLength(s);
    }

}

package EncodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.List;

public class MySolution {

    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for (String s : strs) encoded.append(s.length()).append('#').append(s);

        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<>();

        int u = 0;
        while (u < str.length()) {

            int v = u;
            while (str.charAt(v) != '#') v++;

            int length = Integer.parseInt(str.substring(u, v));

            u = v + 1 + length;

            decoded.add(str.substring(v+1, u));
        }

        return decoded;
    }


}

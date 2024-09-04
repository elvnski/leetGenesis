package SumOfDigitsOfStringAfterConvert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySolution {

    public int getLucky(String s, int k) {

        char[] sArray = s.toCharArray();

        String sIntegerString = "";

        for (char ch : sArray) sIntegerString += String.valueOf((int) ch - 96);

        String target = sIntegerString;
        System.out.print(target + " -> ");
        int transform = 0;

        for (int u = 0; u < k; u++){

            for (int v = 0; v < target.length(); v++){

                transform += Character.getNumericValue(target.charAt(v));
                System.out.print(Character.getNumericValue(target.charAt(v)) + " + ");
            }

            System.out.print(" = " + transform);

            target = String.valueOf(transform);

            System.out.println("\nNEW TARGET: " + target);

            System.out.print("\n" + target + " -> ");

            transform = 0;
        }


        return Integer.parseInt(target);
    }
}

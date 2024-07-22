package RomanToInteger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MySolution {

    public int romanToInt(String s) {

        Map<String, Integer> romanSymbols = new HashMap<>();

        romanSymbols.put("I", 1);
        romanSymbols.put("V", 5);
        romanSymbols.put("X", 10);
        romanSymbols.put("L", 50);
        romanSymbols.put("C", 100);
        romanSymbols.put("D", 500);
        romanSymbols.put("M", 1000);
        romanSymbols.put("IV", 4);
        romanSymbols.put("IX", 9);
        romanSymbols.put("XL", 40);
        romanSymbols.put("XC", 90);
        romanSymbols.put("CD", 400);
        romanSymbols.put("CM", 900);

        String[] sArray = s.split("");

        int integerValue = 0;

        for(int i = 0; i < sArray.length; i++){

            //Here we first check if i + 1 is within the bounds of our array
            //then we check if the two susequent characters are in out HashMap
            if((i + 1) < sArray.length && romanSymbols.containsKey(sArray[i] + sArray[i + 1])){

                //If found we add the value to our result
                integerValue += romanSymbols.get(sArray[i] + sArray[i + 1]);
                i++; //we increment here so that this loop will have incremented by two
            }
            else if (romanSymbols.containsKey(sArray[i])){

                integerValue += romanSymbols.get(sArray[i]);
            }
        }

        return integerValue;
    }

}

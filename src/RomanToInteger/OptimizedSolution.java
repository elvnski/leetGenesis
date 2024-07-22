package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class OptimizedSolution {

    public int romanToInt(String s) {

        Map<Character, Integer> romanSymbols = new HashMap<>();

        romanSymbols.put('I', 1);
        romanSymbols.put('V', 5);
        romanSymbols.put('X', 10);
        romanSymbols.put('L', 50);
        romanSymbols.put('C', 100);
        romanSymbols.put('D', 500);
        romanSymbols.put('M', 1000);


        int integerValue = 0;


        for(int i = 0; i < s.length(); i++){

            //if the first character's value is smaller than its subsequent then its a Roman subtraction
            if((i + 1) < s.length() && romanSymbols.get(s.charAt(i)) < romanSymbols.get(s.charAt(i + 1))){

                integerValue -= romanSymbols.get(s.charAt(i));
            }
            //Otherwise it's an addition
            else {

                integerValue += romanSymbols.get(s.charAt(i));
            }

        }

        return integerValue;
    }


}

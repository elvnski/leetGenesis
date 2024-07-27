package ValidParentheses;

import java.util.*;

public class MySolution {

    public boolean isValid(String s){

        if ((s.length() % 2) != 0) return false;

        Map<Character, Character> closingBrackets = new HashMap<>();
        closingBrackets.put('}', '{');
        closingBrackets.put(')', '(');
        closingBrackets.put(']', '[');

        Stack<Character> bracketStack = new Stack<>();

        for (int k = 0; k < s.length(); k++){

            if (s.charAt(k) == '(' || s.charAt(k) == '{' || s.charAt(k) == '[') bracketStack.push(s.charAt(k));

            if (bracketStack.isEmpty()) return false;
            else if (bracketStack.peek() == closingBrackets.get(s.charAt(k))) bracketStack.pop();
            else return false;
        }

        return bracketStack.isEmpty();
    }
}
package MinimumStringLengthAfterRemovingSubStrings;

import java.util.Stack;

public class OptimizedSolution {

    public int minLength(String s) {

        Stack<Character> pureStack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (pureStack.isEmpty()) {

                pureStack.push(ch);
                continue;
            }

            if (ch == 'B' && pureStack.peek() == 'A' ) pureStack.pop();
            else if (ch == 'D' && pureStack.peek() == 'C' ) pureStack.pop();
            else pureStack.push(ch);
        }

        return pureStack.size();
    }


    public int minLengthVerbose(String s) {

        Stack<Character> pureStack = new Stack<>();

        for (char ch : s.toCharArray()) {

            System.out.println("\n");

            if (pureStack.isEmpty()) {

                pureStack.push(ch);
                System.out.println("Stack is empty! Pushed: " + ch);
                System.out.println("Stack is now: " + pureStack);
                continue;
            }

            if (ch == 'B' && pureStack.peek() == 'A' ) {

                System.out.println("Found 'AB' substring. \nRemoving A");
                pureStack.pop();
            }
            else if (ch == 'D' && pureStack.peek() == 'C' ) {

                System.out.println("Found 'CD' substring. \nRemoving C");
                pureStack.pop();
            }
            else {

                System.out.println("Found no substring! \nAdding '" + ch + "' to stack");
                pureStack.push(ch);
            }

            System.out.println("Stack is now: " + pureStack);
        }

        System.out.println("\n\nAt end of Algorithm.");
        System.out.println("s: " + pureStack);

        return pureStack.size();
    }
}

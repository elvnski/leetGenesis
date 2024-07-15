package PalindromeNumber;

public class PalindromeNumberSolutions {


    public void solve(int trial) {

        System.out.print("STRING REVERSAL: ");
        System.out.println((new StringReversal()).isPalindrome(trial));

        System.out.print("FULL NUMBER REVERSAL: ");
        System.out.println((new FullNumberReversal()).isPalindrome(trial));

        System.out.print("HALF NUMBER REVERSAL: ");
        System.out.println((new HalfNumberReversal()).isPalindrome(trial));
    }

}

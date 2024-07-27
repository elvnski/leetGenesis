package PalindromeNumber;

public class HalfNumberReversal {

    public boolean isPalindrome(int x){

        if(x < 0 || (x != 0 && x % 10 == 0)) return false;

        int reversed = 0;

        // whenever the reversed number is greater than the reversed number it means we have reversed at least
        // half the original number
        while (x > reversed){

            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // the second condition allows us to ignore the middle digit in integers with an odd digits count
        return (x == reversed) || (x == reversed / 10);
    }

}

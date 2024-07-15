package PalindromeNumber;

public class FullNumberReversal {

    public boolean isPalindrome(int x){

        //Negative numbers cannot be a palindrome because of the leading minus
        //non-zero numbers ending with a zero cannot be palindromes
        if(x < 0 || (x != 0 && x % 10 == 0)) return false;

        long reversed = 0;
        long temp = x;

        //x becomes a zero integer when the last digit is divided by 10
        while (temp != 0){

            //the last digit obtained as a remainder of the input number x divided ny 10
            int digit = (int) temp % 10;
            //We move the digits to the left by multiplying with 10 then add the digit;
            reversed = reversed * 10 + digit;

            //Here we divide the mutated inpit by 10 to remove the trailing digit which was reversed
            temp /= 10;
        }

        return (reversed == x);
    }

}

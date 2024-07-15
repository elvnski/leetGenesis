package PalindromeNumber;

public class StringReversal {

    public Boolean isPalindrome(int x){

        String stringX = String.valueOf(x);
        String reversedX = new StringBuilder(stringX).reverse().toString();

        return reversedX.equals(stringX);
    }

}

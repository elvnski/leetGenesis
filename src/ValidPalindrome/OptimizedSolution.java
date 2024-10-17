package ValidPalindrome;

public class OptimizedSolution {

    public boolean isPalindrome(String s) {

        if (s.isEmpty()) return true;

        int left = 0, right = s.length() - 1;

        while (left <= right) {

            char currentLeft = s.charAt(left);
            char currentRight = s.charAt(right);

            if (!Character.isLetterOrDigit(currentLeft)) left++;
            else if (!Character.isLetterOrDigit(currentRight)) right--;
            else {

                if (Character.toLowerCase(currentRight) != Character.toLowerCase(currentLeft)) return false;

                left++;
                right--;
            }
        }

        return true;
    }
}

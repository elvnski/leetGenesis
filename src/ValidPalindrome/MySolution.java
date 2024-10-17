package ValidPalindrome;

public class MySolution {

    public boolean isPalindrome(String s) {

        if (s.isEmpty()) return true;

        s = s.replaceAll(" ", "").toLowerCase();

        StringBuilder sBuilder = new StringBuilder();

        for (char c : s.toCharArray()) if (Character.isAlphabetic(c) || Character.isDigit(c)) sBuilder.append(c);

        System.out.println(sBuilder);
        System.out.println(sBuilder.reverse());

        String original = sBuilder.toString();
        String reversed = sBuilder.reverse().toString();


        return original.equals(reversed);
    }
}

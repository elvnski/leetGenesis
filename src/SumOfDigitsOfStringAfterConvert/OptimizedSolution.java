package SumOfDigitsOfStringAfterConvert;

public class OptimizedSolution {

    public int getLucky(String s, int k) {

        int transform = 0;

        for (char c : s.toCharArray()){

            int value = c - 'a' + 1;
            transform += value/10 + value%10;
            System.out.println("Transform is: " + value/10 + " + " + value%10 + " = " + transform);
        }

        while(k-- > 1){

            int newTransform = 0;

            while (transform > 0) {

                newTransform += transform % 10;
                transform /= 10;
            }

            transform = newTransform;
        }

        return transform;
    }
}

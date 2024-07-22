package RomanToInteger;

public class RomanToIntegerSolutions {

    public void solve(String s){

        System.out.print("MY SOLUTION: ");
        System.out.println((new MySolution()).romanToInt(s));

        System.out.print("OPTIMIZED SOLUTION: ");
        System.out.println((new OptimizedSolution()).romanToInt(s));
    }

}

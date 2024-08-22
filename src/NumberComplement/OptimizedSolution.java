package NumberComplement;

public class OptimizedSolution {

    public int findComplement(int num) {

        int bitMask = (Integer.highestOneBit(num) << 1) - 1;

        return num ^ bitMask;
    }
}

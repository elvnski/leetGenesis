package NumberComplement;

public class MySolution {

    public int findComplement(int num) {

        String binary = Integer.toBinaryString(num);
        StringBuilder complementBuilder = new StringBuilder();

        for (Character bit : binary.toCharArray()){

            if (bit.equals('0')) complementBuilder.append('1');
            else complementBuilder.append('0');
        }

        return Integer.parseInt(complementBuilder.toString(), 2);
    }
}

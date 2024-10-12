package ContainsDuplicate;

import java.util.*;

public class MySolution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> frequencySet = new HashSet<>() ;

        for(int no : nums) {

            if(frequencySet.contains(no)) return true;
            else frequencySet.add(no);
        }


        return false;
    }
}

package MyCalendarTwo;

import java.util.Map;
import java.util.TreeMap;


public class MyCalendarTwo {

    private final TreeMap<Integer, Integer> singles;
    private final TreeMap<Integer, Integer> doubles;

    public MyCalendarTwo() {

        this.singles = new TreeMap<>();
        this.doubles = new TreeMap<>();
    }

    public boolean book(int start, int end) {

        for (Map.Entry<Integer, Integer> doubleEntry : this.doubles.entrySet()) {

            if (Math.max(start, doubleEntry.getKey()) < Math.min(end, doubleEntry.getValue())) return false;
        }

        for (Map.Entry<Integer, Integer> singleEntry : this.singles.entrySet()) {

            if (Math.max(start, singleEntry.getKey()) < Math.min(end, singleEntry.getValue()))
                doubles.put(Math.max(start, singleEntry.getKey()), Math.min(end, singleEntry.getValue()));
        }


        singles.put(start, end);

        return true;
    }

    public boolean bookVerbose(int start, int end) {

        System.out.println("Trying to book " + start + " to " + end);

        for (Map.Entry<Integer, Integer> doubleEntry : this.doubles.entrySet()) {

            if (Math.max(start, doubleEntry.getKey()) < Math.min(end, doubleEntry.getValue())) {

                System.out.println("\nFound Existing Double entry for: [" + start + ", " + end + "]");
                return false;
            }
        }

        for (Map.Entry<Integer, Integer> singleEntry : this.singles.entrySet()) {

            if (Math.max(start, singleEntry.getKey()) < Math.min(end, singleEntry.getValue())) {

                System.out.println("\nFound Existing Single entry for: [" + start + ", " + end + "]");
                System.out.println("Adding to Double Bookings");
                doubles.put(Math.max(start, singleEntry.getKey()), Math.min(end, singleEntry.getValue()));
            }
        }


        System.out.println("Adding to Single Bookings");
        singles.put(start, end);

        return true;
    }
}
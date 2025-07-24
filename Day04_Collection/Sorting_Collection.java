package Day04_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_Collection {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<>();
        // nums.add(4);
        // nums.add(3);
        // nums.add(6);
        // nums.add(1);
        // nums.add(9);

        // Collections.sort(nums);

        // System.out.println(nums);

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };

    }
}

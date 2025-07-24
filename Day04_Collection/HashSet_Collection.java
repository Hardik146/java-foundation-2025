package Day04_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Collection {

    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(2);
        nums.add(8);
        nums.add(5);
        nums.add(14);
        nums.add(23);

        // for (int n : nums) {
        // System.out.println(n);
        // }

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}

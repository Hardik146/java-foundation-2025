package Day03_Java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEach {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 9, 6, 2, 3);

        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con);

        // OR

        // nums.forEach(n -> System.out.println(n));

        // using stream api
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // int result = s3.reduce(0, (c, e) -> c + e);

        int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e);

        System.out.println(result);

    }
}

package Day03_Java8Feature;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface A {
    // void show(int i);
    int add(int i, int j);

}

// class B implements A {
// public void show() {
// System.out.println("in Show");
// }
// }

public class LambdaExpression {
    public static void main(String[] args) {
        // A obj = new A() { //to tackle this use lambda expression
        // public void show(i) {
        // System.out.println("in showwwww " + i);
        // }
        // };

        // A obj = (i) -> System.out.println("in showww " + i);
        // A obj = i -> System.out.println("in showww " + i); // if only single variable

        // obj.show(5);

        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");
        names.forEach(name -> System.out.println(name));

        // also

        A obj1 = (i, j) -> i + j;
        int val = obj1.add(4, 5);
        System.out.println(val);
    }
}
package Day04_Collection;

import java.util.HashMap;
import java.util.Map;

public class Map_Collection {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("navin", 50);
        students.put("pravin", 96);
        students.put("rushabh", 26);
        students.put("yash", 20);

        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }
}

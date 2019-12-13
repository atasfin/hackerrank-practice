package HasMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapCode {

    public static void main(String[] args) {

        Map<Integer, String> student = new HashMap<>();

        student.put(1, "Javed");
        student.put(2, "Mahin");
        student.put(3, "Simon");

       for(Integer id: student.keySet()){
            System.out.println(id + ":" + student.get(id));
        }
    }

}

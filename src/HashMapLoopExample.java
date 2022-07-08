import java.util.*;

public class HashMapLoopExample {
    public static void main(String args[]) {

        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("Key1", "Value1");
        hashmap.put("Key2", "Value2");
        System.out.println("Iterating using foreach loop");

        for (String key : hashmap.keySet()) {
            System.out.println("key: " + key + " value: " + hashmap.get(key));
        }
    }
}
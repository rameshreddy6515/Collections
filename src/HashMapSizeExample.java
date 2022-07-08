import java.util.*;

public class HashMapSizeExample {
    public static void main(String args[]) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "CocoCola");
        map.put(2, "Pepsi");
        map.put(3, "Thums Up");
        map.put(4, "Fanta");
        System.out.println(" Size of the given HashMap is: "+ map.size());
    }
}
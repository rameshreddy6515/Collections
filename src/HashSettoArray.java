//Convert HashSet To Array
import java.util.*;

public class HashSettoArray {
    public static void main(String args[]) {
        HashSet<String> hashset = new HashSet<String>();
        hashset.add("Pear");
        hashset.add("Apple");
        hashset.add("Orange");
        hashset.add("Papaya");
        hashset.add("Banana");
        System.out.println("HashSet contains :" + hashset);
        String[] array = new String[hashset.size()];
        hashset.toArray(array);
        System.out.println("Array contains :");
        for(String str : array){
            System.out.println(str);
        }
    }
}
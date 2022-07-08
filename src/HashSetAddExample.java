//add elements to HashSet
import java.util.*;
public class HashSetAddExample {
    public static void main(String args[]) {

        HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(3);
        hs.add(17);
        hs.add(6);
        hs.add(9);
        hs.add(7);
        System.out.println("Using Advanced For Loop");

        for (Integer num : hs) {
            System.out.println(num);
        }
    }
}
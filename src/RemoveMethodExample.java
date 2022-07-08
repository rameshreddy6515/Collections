//Remove String elements at the specified index

import java.util.*;
public class RemoveMethodExample {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("AA");
        list.add("ZZ");
        System.out.println("Given ArrayList before remove method: ");
        for(String str : list) {
            System.out.println(str);
        }
        list.remove(0);
        list.remove(2);
        list.remove(3);
        System.out.println("ArrayList after applying remove method: ");
        for(String str2 : list) {
            System.out.println(str2);
        }
    }
}
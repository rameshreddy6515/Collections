//Sorting ArrayList of String in Descending Order

import java.util.*;

public class ArrayListDescendingSort {
    public static void main(String args[]) {

        ArrayList<String> arrList = new ArrayList();
        arrList.add("Apple");
        arrList.add("Banana");
        arrList.add("Pear");
        arrList.add("Mango");

        System.out.println("ArrayList Before Sorting:");
        for(String s: arrList){
            System.out.println(s);
        }
        Collections.sort(arrList, Collections.reverseOrder());

        System.out.println("ArrayList in descending order:");
        for(String str: arrList){
            System.out.println(str);
        }
    }
}

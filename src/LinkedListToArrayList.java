//LinkedList to ArrayList

import java.util.*;

class LinkedListToArrayList {
    public static void main(String args[]) {

        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Mango");
        linkedlist.add("Banana");
        linkedlist.add("Pear");
        linkedlist.add("Apple");
        linkedlist.add("Orange");

        List<String> list = new ArrayList(linkedlist);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
//Reverse LinkedList
import java.util.*;
public class ReverseLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();

        linkedlist.add(23);
        linkedlist.add(42);
        linkedlist.add(56);
        linkedlist.add(75);
        linkedlist.add(78);
        linkedlist.add(80);
        linkedlist.add(96);

        System.out.println("Before Reverse LinkedList:");
        System.out.println(linkedlist);
        Collections.reverse(linkedlist);
        System.out.println("After Reverse LinkedList:");
        System.out.println(linkedlist);
    }
}
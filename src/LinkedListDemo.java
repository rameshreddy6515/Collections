import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){

        LinkedList<String> list=new LinkedList<String>();
        list.add("ramesh");
        list.add("naresh");
        list.add("suresh");
        list.addFirst("balu");
        list.addLast("somu");
        list.add(2, "sekhar");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

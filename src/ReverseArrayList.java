//Reverse ArrayList
import java.util.*;

public class ReverseArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("Apple");
        arrlist.add("Amazon");
        arrlist.add("Facebook");
        arrlist.add("Google");
        arrlist.add("IBM");
        arrlist.add("Tesla");
        System.out.println("Before Reverse ArrayList:");
        System.out.println(arrlist);
        Collections.reverse(arrlist);
        System.out.println("After Reverse ArrayList:");
        System.out.println(arrlist);
    }
}

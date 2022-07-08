//swap two elements in an array list

import java.util.ArrayList;
import java.util.Collections;
public class Javacollectionexcercise {
    public static void main(String[] args) {
        ArrayList<String> Stringslist1= new ArrayList<String>();
        Stringslist1.add("Audi");
        Stringslist1.add("BMW");
        Stringslist1.add("Bugatti");
        Stringslist1.add("Ford");
        Stringslist1.add("Honda");

        System.out.println("Array list before Swap:");
        for(String a: Stringslist1){
            System.out.println(a);
        }

        Collections.swap(Stringslist1, 0, 2);
        System.out.println("Array list after swap:");
        for(String b: Stringslist1){
            System.out.println(b);
        }
    }
}
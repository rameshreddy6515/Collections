//Convert an Array to ArrayList in Java
import java.util.*;

public class ConvertArrayToArrayList {
    public static void main(String args[]) {

        String[] cities={"Bangalore", "Chennai", "Hyderbad", "Mumbai"};
        ArrayList<String> list= new ArrayList<>(Arrays.asList(cities));

        list.add("Ramesh");
        list.add("Naresh");


        for(String s : list) {
            System.out.println(s);
        }
    }
}
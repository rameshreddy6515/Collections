import java.util.ArrayList;

public class JoinTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> Stringslist1= new ArrayList<String>();
        Stringslist1.add("Audi");
        Stringslist1.add("BMW");
        Stringslist1.add("Bugatti");
        Stringslist1.add("Ford");
        Stringslist1.add("Honda");

        System.out.println("First array list: " + Stringslist1);
        ArrayList<String> Stringslist2= new ArrayList<String>();
        Stringslist2.add("Ferrari");
        Stringslist2.add("Fiat");
        Stringslist2.add("Honda");
        Stringslist2.add("Hyundai");
        System.out.println("Second array list: " + Stringslist2);

        ArrayList<String> a = new ArrayList<String>();
        a.addAll(Stringslist1);
        a.addAll(Stringslist2);
        System.out.println("New array list: " + a);


    }
}

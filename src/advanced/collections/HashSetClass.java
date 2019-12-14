package advanced.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetClass {
    public static void main(String[] args) {

        // TreeSet it's mean one by one. HashSet it's random1
        Set<String> langs1 = new TreeSet<>();

        langs1.add("english");
        langs1.add("estonian");
        langs1.add("french");
        langs1.add("english");

        /*for (String x : langs1) {
            System.out.println(x);
        }*/

        Set<String> lang2 = new HashSet<>();
        lang2.add("java");
        lang2.add("python ");
        lang2.add("scala");

        // add second set ot first set
        langs1.addAll(lang2);

        for (String x : langs1) {
            System.out.println(x);
        }
    }
}

package advanced.collections;

import java.util.*;

public class ArrayListClass {
    // Print names of students in JT9
    public static void main(String[] args) {
        List<String> namesOfStudentsJT9 = new ArrayList<>();
        namesOfStudentsJT9.add("Ilya");
        namesOfStudentsJT9.add("Deniss");
        namesOfStudentsJT9.add("Jevgeni");
        namesOfStudentsJT9.add("Lauri");
        namesOfStudentsJT9.add("Mari");
        namesOfStudentsJT9.add("Mladlen");
        namesOfStudentsJT9.add("Oleksandr");
        namesOfStudentsJT9.add("Vladislav");
        namesOfStudentsJT9.add("Mikhael");

        for (String name : namesOfStudentsJT9){
            System.out.println(name);
        }

        // Linked list

        List<String> linkedNames = new LinkedList<>();
        linkedNames.add("phone1");
        linkedNames.add("phone2");
        linkedNames.add("phone3");

        ListIterator<String> iterator = linkedNames.listIterator();
        //String nexElement = iterator.next();
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //move back
        System.out.println(iterator.previous());



    }



}

package advanced.collections;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {

       /*Map<String ,Map> gradeMapper = new HashMap<>();
        Map<String, Object> detail = new HashMap<>();

        detail.put("ID", 122);
        detail.put("BirthPlace", "Riga");

        gradeMapper.put("John", detail);

        for (Map.Entry<String, Map> item : gradeMapper.entrySet()) {
            System.out.println(item.toString());


            System.out.println("-----------------------");
        }

       // Names and surnames
        Map<String, String> nameAndSurname = new HashMap<>();
        nameAndSurname.put("Ilon", "Mask");
        nameAndSurname.put("Steve", "Jobs");
        nameAndSurname.put("Bill", "Gates");

        for (Map.Entry<String, String> map : nameAndSurname.entrySet()) {
            System.out.println(map);
        }

        System.out.println("-----------------------");


        // Names and ages
        Map<String, Integer> nameAndAges = new HashMap<>();
        nameAndAges.put("Ilon", 25);
        nameAndAges.put("Steve", 37);
        nameAndAges.put("Bill", 49);

        for (Map.Entry<String, Integer> map : nameAndAges.entrySet()) {
            System.out.println(map);
        }

        System.out.println("-----------------------");



        // Names and lists of friends
       Map<String, List> listOfFriends = new HashMap<>();
       List<String> friends = new ArrayList<>();

       friends.add("John");
       friends.add("Mike");
       friends.add("Maria");

       listOfFriends.put("David", friends);
       listOfFriends.put("Markus", friends);
       listOfFriends.put("Donald", friends);

        for (Map.Entry<String, List> map : listOfFriends.entrySet()) {
            System.out.println(map);
        }

        System.out.println("-----------------------");

        // With Map<Person, Friend>
        Map<Person, Friend> personFriendMap = new HashMap<>();
        Person person = new Person();
        Friend friend = new Friend();
        personFriendMap.put(person, friend);

        for (Map.Entry<Person, Friend> map : personFriendMap.entrySet()) {
            System.out.println(map);
        }
*/

        // Names and surnames
        Scanner scanner = new Scanner(System.in);
        Map<String, String> nameAndSurname = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Please insert name");
            String name = scanner.next();
            System.out.println("Insert second name");
            String secondname = scanner.next();
            nameAndSurname.put(name, secondname);
        }

        for (Map.Entry<String, String> map : nameAndSurname.entrySet()) {
            System.out.println(map);
        }


    }
}

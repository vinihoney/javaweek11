package JavaWeeK11;

import java.util.Collections;
import java.util.HashMap;

/* 7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.  */
public class HasmapQ7 {
    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();   // Creating a HashMap to store String and Integer values

        people.put("Ayan", 25); // Adding value string and integer
        people.put("Miten", 25);
        people.put("Zarna", 22);
        people.put("Pankti", 22);

        System.out.println("Age:");

        for (Integer age : people.values()) { // Using a for-each loop to iterate over the values in the map

          //Collections.sort(age); //not working
            System.out.println(age);
        }
        System.out.println("Name:");
        for (String name : people.keySet()){ // Using a for-each loop to iterate over the values in the map
          //  Collections.sort(name);
            System.out.println(name);
        }
    }
}

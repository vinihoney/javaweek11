package JavaWeeK11;

import java.util.HashSet;

/* 6. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)  */
public class HassetQ6 {
    public static void main(String[] args) {

        HashSet<Integer> numberSet = new HashSet<>();  // HashSet to store Integer
        numberSet.add(4);// Storing the numbers
        numberSet.add(7);
        numberSet.add(8);

        System.out.println("Numbers between 1 and 10 in the set:");  // Displaying which numbers in the set

        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}

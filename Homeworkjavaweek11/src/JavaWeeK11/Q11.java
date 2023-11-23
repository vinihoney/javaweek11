package JavaWeeK11;

import java.util.ArrayList;
import java.util.List;

/*11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.  */
public class Q11 {
    private static String myName = "Code2 : Sonal"; // Global variable
    public static void main(String[] args) {
        // Create a list to store group names
        List<String> groupNames = new ArrayList<>();

        // Add group names to the list
        groupNames.add("Java");
        groupNames.add("Agile");
        groupNames.add("Code1");
        groupNames.add("Restasurred");
        groupNames.add("Code2 : Sonal"); // Adding your name to the list

        // Iterate through the list using a for-each loop
        System.out.println("Group Names:");

        for (String groupName : groupNames) {
            // Check if the current group name is your name and print it
            if (myName.equals(groupName)) {
                System.out.println("Hey, that's me! " + myName);
            }
        }
    }
}

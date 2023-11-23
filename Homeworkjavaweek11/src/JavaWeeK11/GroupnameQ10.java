package JavaWeeK11;

/*10. Write program and add all group members names in to array and iterates
through for each loop and print your name.  */
public class GroupnameQ10 {
    public static void main(String[] args) {
        // Create an array to store group member names
        String[] groupMembers = {"Zarna", "Pankti", "Miten", "Ayan", "Sonal"};

        // Iterate through the array using a for-each loop
        System.out.println("Group Members:");

        for (String memberName : groupMembers) {
            System.out.println(memberName);

            // Check if the current member name is "YourName" and print a special message
            if ("Sonal".equals(memberName)) {
                System.out.println("Hey, that's me! " + memberName);
            }
        }
    }
}

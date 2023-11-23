package JavaWeeK11;
/* 9. Write program and add all group names in to array and iterates through for
each loop.  */
public class GroupnameQ9 {
    public static void main(String[] args) {

        String[] groupNames = {"Code1", "Code2", "Agile", "Java", "Restassured"}; // Create an array for group names

        System.out.println("Group Names:");

        for (String groupName : groupNames) { // using a for-each loop
            System.out.println(groupName);
        }
    }
}

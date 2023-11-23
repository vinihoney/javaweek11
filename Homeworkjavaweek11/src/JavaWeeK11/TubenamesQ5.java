package JavaWeeK11;

import java.util.ArrayList;

/* 5. Write a Java program to test an array list is empty or not. Define array list with underground tube names  */
public class TubenamesQ5 {
    public static void main(String[] args) {
        // Creating an ArrayList of underground tube names
        ArrayList<String> tubeNames = new ArrayList<>();

        // Adding some tube names
        tubeNames.add("Piccadilly Line");
        tubeNames.add("Central Line");
        tubeNames.add("Jubilee Line");
        tubeNames.add("District Line");
        tubeNames.add("Circle Line");

        if (tubeNames.isEmpty()) { // Checking if the ArrayList is empty
            System.out.println("The list of underground tube names is empty.");
        } else {
            System.out.println("The list of underground tube names is not empty.");
            System.out.println("Tube Names:");

            for (String tubeName : tubeNames) {  // Displaying the tube names
                System.out.println(tubeName);
            }
        }
    }
}
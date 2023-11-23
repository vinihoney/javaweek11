package JavaWeeK11;

import java.util.ArrayList;

/* 3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.  */
public class ColoursarraylistQ3 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>(); // declare arraylist
        colours.add("Red");
        colours.add("Amber");
        colours.add("Blue");
        colours.add("Purple");
        colours.add("Indigo");
        colours.add("Orange");
        colours.add("Green");

        for (String a : colours) {
              System.out.println(a);
            }

        }
    }

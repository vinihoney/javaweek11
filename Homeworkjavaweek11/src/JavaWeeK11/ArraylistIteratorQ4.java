package JavaWeeK11;
/* 4. Write a Java program to iterate through all elements in an array list using Iterator.*/

import java.util.ArrayList;

public class ArraylistIteratorQ4 {

    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();// Creating an ArrayList

        List.add("Ayan");  // ArrayList
        List.add("Zarna");
        List.add("Miten");
        List.add("Pankti");
        List.add("Bina");

        java.util.Iterator<String> iterator = List.iterator();// Using Iterator

        System.out.println("Elements in ArrayList:");

        while (iterator.hasNext()) {
            String elements = iterator.next();
            System.out.println(elements);
        }
    }
}

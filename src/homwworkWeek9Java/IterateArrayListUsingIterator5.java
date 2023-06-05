package homwworkWeek9Java;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list using
//It
public class IterateArrayListUsingIterator5 {

    public static void m1() {
        // Create an array list
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the array list
        list.add("java");
        list.add("JavaScript");
        list.add("Python");
        list.add("c++");

        // iterator for the array list
        Iterator<String> iterator = list.iterator();

        // Iterate through the array list using the iterator
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        IterateArrayListUsingIterator5.m1();
    }
}

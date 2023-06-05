package homwworkWeek9Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to retrieve an element (at a specified index) from a given
//array list
public class RetrieveArrayList6 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        // Add elements to the array list
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Pink");
        // Print the element
        System.out.println("The element on index 3 in the Arraylist is : " + " is " + list.get(2));
    }
}

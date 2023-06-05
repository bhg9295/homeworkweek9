package homwworkWeek9Java;
// Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
import java.util.ArrayList;

public class ArrayListColourUsingForEachLoop4 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        printColors(colors);
    }

    public static void printColors(ArrayList<String> colors) {
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

package homwworkWeek9Java;
/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
else)*/

import java.util.HashSet;

public class Hashset8 {
    public static void main(String[] args) {
        // Create a HashSet object
        HashSet<Integer> set = new HashSet<>();

        // Add the numbers 4, 7, and 8 to the set
        set.add(4);
        set.add(7);
        set.add(8);



        // Iterate through the numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Check if the current number is in the set
            if (set.contains(i)) {

                // Print the number
                System.out.println(i);
            }
        }
    }
}

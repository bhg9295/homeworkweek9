package homwworkWeek9Java;
/* Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map*/
import java.util.HashMap;

public class Hashmap9 {
    public static void m1() {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        // Use a for each loop to iterate the value from Map
        for (String name : people.keySet()) {
            System.out.println("Name: " + name + " Age: " + people.get(name));
        }
    }

    public static void main(String[] args) {
        m1();
    }


}

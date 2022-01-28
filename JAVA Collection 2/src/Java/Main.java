package Java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//		String[] arr = new String[10];
        ArrayList<String> list = new ArrayList(); // []
        System.out.println("Initial Length: " + list.size());


        // Adding items to arraylist
        list.add("String 1"); // ["String 1"]
        list.add("String 2"); // ["String 1", "String 2"]
        list.add("String 3"); // ["String 1", "String 2", "String 3"]
        System.out.println("Current Length: " + list.size());

        // Access items
        String s1 = list.get(0); // s1 = "String 1"
        String s2 = list.get(2); // s2 = "String 3"
        System.out.println(s2);

        // Passing arraylist to a function
        printList(list);

        list.set(1, "String N"); // arr[2] = "123"
        // ["String 1", "String N", "String 3"]
        printList(list);

        // Remove specific item
        list.remove(1); // ["String 1", "String 3"]
        // After remove, list = "String 1", "String 3"
        printList(list);

        // Add to specific index
        list.add(1, "String 4");
        // After add, list = "String 1", "String 4", "String 3"
        printList(list);
        System.out.println("Contains 4? : " + list.contains("String 4"));

        // Chance item at specific index
        list.add(1, "String 5");
        // After set, list = "String 1", "String 5", "String 3"
        printList(list);

        System.out.println("Index of 4: " + list.indexOf("String 4"));
        System.out.println("Contains 4? : " + list.contains("String 4"));

        list.remove("String 4");
        printList(list);
        System.out.println("Contains 4? : " + list.contains("String 4"));

        // Size of arraylist
        int size = list.size(); // size = 3

        // Clear the list
        list.clear(); // []
        printList(list);
    }

    public static void printList(ArrayList<String> mList) { // String[]
        System.out.print(mList.size() + "-> [");
        for (String s : mList) {
            System.out.print(s + ", ");
        }
        System.out.println("]");
    }
}

package Java;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> people=new HashMap<String,Integer>();


        people.put("Abdullah",34);
        people.put("Mohammad",22);
        people.put("Amina",33);
        people.put("Ayesha",21);

        System.out.println(people.get("Amina"));
        System.out.println(people.get("Mohammad"));
	// write your code here
    }
}

package Java;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

    HashSet<String>fruitsName=new HashSet<>();

    fruitsName.add("JackFruit");
    fruitsName.add("BlackBerry");
    fruitsName.add("StrawBerry");
    fruitsName.add("Pineapple");

        System.out.println(fruitsName);
        System.out.println("Size: "+fruitsName.size());
        fruitsName.remove("Pineapple");
        System.out.println(fruitsName);
        fruitsName.clear();
        System.out.println(fruitsName);
	// write your code here
    }
}

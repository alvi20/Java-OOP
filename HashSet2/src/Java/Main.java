package Java;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> footballer=new HashSet<String>();

        footballer.add("Salah");
        footballer.add("Messi");
        footballer.add("Aguero");
        footballer.add("Benzema");
        footballer.add("Mbappe");

        System.out.println(footballer);
        System.out.println("Size: "+footballer.size());

	// write your code here
    }
}

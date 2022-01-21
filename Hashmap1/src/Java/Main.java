package Java;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> customer=new HashMap<Integer,String>();

        customer.put(101,"Alvi");
        customer.put(154,"Rahim");
        customer.put(143,"Karim");
        customer.put(193,"Jasim");

        System.out.println(customer.get(101));
        System.out.println(customer.get(154));
        System.out.println(customer.get(143));
        System.out.println(customer.get(193));

	// write your code here
    }
}

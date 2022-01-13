package Java;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> number=new ArrayList<Integer>();
        System.out.println("Size:"+number.size());

        //adding elements

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        Iterator itr=number.iterator();
        while(itr.hasNext()){
            System.out.println(" "+itr.next());
        }
        System.out.println("Size= "+number.size());

        //Removing Elements
        number.remove(2);
        System.out.println("After removing: "+number);
	// write your code here
    }
}

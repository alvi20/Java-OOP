package Java;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        System.out.println("Size is: "+number.size());


        number.add(34);
        number.add(89);
        number.add(23);
        number.add(112);
        number.add(1,223);

        Iterator itr=number.iterator();
            while(itr.hasNext()){
                System.out.println("Size: "+number.size());
                break;
            }





	// write your code here
    }
}

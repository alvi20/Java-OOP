package Java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> number=new ArrayList<Integer>();
        System.out.println("Size:"+number.size());

        //adding elements

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        for(int x:number){
            System.out.println(" "+x);
        }
        System.out.println("Size= "+number.size());

	// write your code here
    }
}

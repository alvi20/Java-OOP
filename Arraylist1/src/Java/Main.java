package Java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array1=new ArrayList<Integer>();
        System.out.println("Array Size: "+array1.size());
        array1.add(34);
        array1.add(56);
        array1.add(23);
        array1.add(76);
        array1.add(2,50);

        for(int x:array1){
            System.out.println(" "+x);
        }
        System.out.println("Size: "+array1.size());





        // write your code here
    }
}

package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(40);
        list.add(5);
        list.add(15);
        list.add(95);
        list.add(70);
        printList(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer left, Integer right) {
                // Input [10 20]
                // Negative return -> No Swap -> [10 20]
                // Zero return -> Equal -> [10 20]
                // Positive return -> Swap -> [20 10]
                Integer l = (Integer) left;
                Integer r = (Integer) right;
                if (l > r) return 1;
                if (l < r) return -1;
                return 0;
            }
        });
        printList(list);
    }

    public static void printList(ArrayList<Integer> mList) {
        System.out.print(mList.size() + "-> [");
        for (Integer s : mList) {
            System.out.print(s + ", ");
        }
        System.out.println("]");
    }
}

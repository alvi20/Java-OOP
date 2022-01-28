package Java;

import java.util.Hashtable;

class Profile {
    String name;
    int age;
    String profession;

    Profile(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Profile{" + "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}


public class Main {

    public static void occurrenceCount() {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int[] a = {1, 3, 1, 4, 2, 2, 1}; //
        for (int x : a) {
            if (ht.containsKey(x))
                ht.put(x, 1 + ht.get(x));
            ht.put(x, 1);
            /*
             * 1 -> 2
             * 3 -> 1
             * */
        }

        for (Integer k : ht.keySet()) {
            System.out.println(k + " -> " + ht.get(k));
        }
    }

    public static void main(String[] args) {

        // [1 3 4 1 5 3]
        // [2 2 1 2 1 2]
        /*
         * 1 -> 2
         * 3 -> 2
         * 4 -> 1
         * 5 -> 1
         * */

        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "Joseph");
        ht.put(5, "Stalin");
        ht.put(20, "Samantha");
        ht.put(1, "Anne");

        /*
         * 1 -> Anne
         * 5 -> Stalin
         * 20 -> Samantha
         * */

        System.out.println(ht.get(5));
        System.out.println(ht.get(1));
        System.out.println(ht.get(20));

        ht.remove(5);

        /*
         * 1 -> Anne
         * 5 -> Stalin
         * */

        System.out.println(ht.get(5));
        System.out.println(ht.get(1));
        System.out.println(ht.get(20));

        if (ht.containsKey(1)) System.out.println("1 exists");
        if (ht.containsKey(20)) System.out.println("20 exists");

        // ht.keySet() = [1,5]
        for (Integer k : ht.keySet()) {
            System.out.println(k + " -> " + ht.get(k));
        }

    }
}



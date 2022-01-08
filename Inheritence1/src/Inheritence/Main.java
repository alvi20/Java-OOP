package Inheritence;

public class Main {

    public static void main(String[] args) {
        Teacher t1=new Teacher();

        t1.name="Hasan Sarwar";
        t1.gender="Male";
        t1.age=56;
        t1.qualification="Ph.d in CSE";

        t1.displayInformation2();
        System.out.println();

        t1.name="Anisul Islam";
        t1.gender="Male";
        t1.age=34;
        t1.qualification="MSC in CSE";

        t1.displayInformation2();

	// write your code here
    }
}

package Inheritence;

public class Main {

    public static void main(String[] args) {
        Teacher t1=new Teacher();

        t1.name="Alvi";
        t1.gender="Male";
        t1.age=25;
        t1.qualification="PH.D in CSE";
        t1.displayInformation2();

        System.out.println();

        t1.name="Masud";
        t1.gender="Male";
        t1.age=45;
        t1.qualification="PH.D in EEE";
        t1.displayInformation2();


	// write your code here
    }
}

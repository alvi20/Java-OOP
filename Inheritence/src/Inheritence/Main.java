package Inheritence;

public class Main {

    public static void main(String[] args) {
        Inheritence.Teacher teacher=new Inheritence.Teacher();

        Inheritence.Teacher t1=new Inheritence.Teacher();
        t1.name="Alvi";
        t1.gender="Male";
        t1.qualification="HSC";
        t1.displayInformtion2();

        Inheritence.Teacher t2=new Inheritence.Teacher();

        t2.name="Rahim";
        t2.gender="Male";
        t2.qualification="BSc in CSE";
        t2.displayInformtion2();
	// write your code here
    }
}

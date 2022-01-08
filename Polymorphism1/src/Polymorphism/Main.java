package Polymorphism;

public class Main {

    public static void main(String[] args) {
        Person p1=new Person();
        p1.display();

        p1=new Teacher();
        p1.display();

        p1=new Student();
        p1.display();
	// write your code here
    }
}

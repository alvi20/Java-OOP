package Inheritence;

public class Teacher extends Person {
    String qualification;
    int age;

    void displayInformation2(){
        System.out.println("Name is: "+name);
        System.out.println("Gender is: "+gender);
        System.out.println("Qualification is: "+qualification);
        System.out.println("Age is: "+age);
    }
}

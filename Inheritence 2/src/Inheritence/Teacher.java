package Inheritence;

public class Teacher extends Person {
    String qualification;

    void displayInformation2(){
        displayInformation1();

        System.out.println("Qualification is = "+qualification);
    }
}

package Inheritence;

public class Child extends Parent {

    String qualification;

    Child(String n,String g,int p,String q){
        name=n;
        gender=g;
        phone=p;
        qualification=q;

    }
    void displayInformation1(){
        displayinformation();
        System.out.println("Qualification is: "+qualification);
    }

}

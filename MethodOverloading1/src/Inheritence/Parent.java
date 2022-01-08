package Inheritence;

public class Parent {
    String name;
    String gender;
    int phone;

    Parent(){
        System.out.println("No information");
    }

    Parent(String n,String g){
        name=n;
        gender=g;
    }
    Parent(String n,String g,int p){
        name=n;
        gender=g;
        phone=p;

    }
    void displayinformation()
    {
        System.out.println
                ("Name: "+name);
        System.out.println
                ("Gender is: "+gender);
        System.out.println
                ("Number is: "+phone);
    }

}

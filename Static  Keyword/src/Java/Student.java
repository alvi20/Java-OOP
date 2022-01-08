package Java;

public class Student {
    String name;
    int id;
    static String college="UIU";


    Student(String n,int i){
        name=n;
        id=i;
    }
    void display(){
        System.out.println("Name is "+name);
        System.out.println("Id is "+id);
        System.out.println("College is "+college);
    }

}

package Java;


public class Child extends Parent {
    String name2;
     public Child(String a, String b){
        super.name1=a;
        name2 = b;
        }

    void show(){
        System.out.println("Super Class name: "+super.name1);
        System.out.println("Sub Class name: "+name2);
    }
    void message(){
        System.out.println("Welcome to Child class");
    }

    void display(){
        message();
        super.message();
    }



}

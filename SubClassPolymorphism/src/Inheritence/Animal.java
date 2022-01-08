package Inheritence;

public class Animal {
    String color;
    int weight;

    void displayInformation1(){
        System.out.println("Color is: "+color);
        System.out.println("Weight is: "+weight);
    }


    void eat(){
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
}

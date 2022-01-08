package Abstraction;

public abstract class MobileUser {

   //Non Abstract Method
    void call(){
        System.out.println("Call method");
    }
    //Abstract Method
    abstract void  sendMessage();
}

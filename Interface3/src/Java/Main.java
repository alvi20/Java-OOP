package Java;

public class Main {

    public static void main(String[] args) {
        //Aeroplane a=new Aeroplane();
        //a.fly();
        //Bird b=new Bird();
        //b.fly();

        Flyable f=new Bird();
        f.fly();
        Flyable g=new Aeroplane();
        g.fly();
	// write your code here
    }
}

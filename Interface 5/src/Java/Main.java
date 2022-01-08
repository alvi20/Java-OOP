package Java;

public class Main {

    public static void main(String[] args) {
        Flyable f=new Bird();
        f.fly();
        Runable r=new Bird();
        r.run();

        //Bird b=new Bird();
        Animal b=new Animal();
        b.name2="Alvi";
        b.age=5;
        b.animal();
	// write your code here
    }
}

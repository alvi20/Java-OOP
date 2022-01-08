package Java;

public class Bird extends Animal implements Flyable,Runable {

    @Override
    public void fly() {
        System.out.println("Birds fly in the "+Flyable.name);
    }

    @Override
    public void run() {
        System.out.println("Birds can not run "+Runable.id);
    }

    @Override
    public void animal() {
        super.animal();

    }
}

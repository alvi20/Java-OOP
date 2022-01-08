package Java;

public class Birds implements Flyable,Runable {

    @Override
    public void fly() {
        System.out.println("Birds can fly in the "+Flyable.name);
    }
    @Override
    public boolean needFuel() {
        return false;
    }
    @Override
    public void canRun() {
        System.out.println("Birds can not run in the air");
    }
}

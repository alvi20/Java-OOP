package Java;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Birds can fly in the "+Flyable.media);
    }

    @Override
    public boolean needFuel() {
        return false;
    }
}

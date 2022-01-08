package Java;

public class Aeroplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Aeroplane is big in the "+Flyable.media);
    }

    @Override
    public boolean needFuel() {
        return false;
    }
}

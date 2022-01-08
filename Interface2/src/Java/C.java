package Java;

public class C implements A,B {
    @Override
    public void run() {
        System.out.println("All is well now");
    }

    @Override
    public void walk() {
        System.out.println("Now okay");
    }
}

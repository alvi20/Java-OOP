package Interface;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dogs can eat eggs");
    }
}

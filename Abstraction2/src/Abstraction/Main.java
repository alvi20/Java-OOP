package Abstraction;

public class Main {

    public static void main(String[] args) {

        Shape s;

        s=new Rectangle(10,20);
        s.area();
        s=new Triangle(10,20);
        s.area();
        s=new Circle(20);
        s.area();

	// write your code here
    }
}

package Java;

public class Main {

    public static void main(String[] args) {
        Shape s1=new Shape();

        s1=new Rectangle(30,40);
        System.out.print("Rectangle is: ");
        System.out.println(s1.area());
        s1=new Triangle(20,10);
        System.out.print("Triangle is: ");
        System.out.println(s1.area());
	// write your code here
    }
}

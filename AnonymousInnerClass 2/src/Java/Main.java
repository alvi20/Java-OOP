package Java;

public class Main {

    public static void main(String[] args) {

        Teacher t=new Teacher() {
            @Override
            void display() {
                System.out.println("Yes I did it");
            }

        };
        t.display();

	// write your code here
    }
}

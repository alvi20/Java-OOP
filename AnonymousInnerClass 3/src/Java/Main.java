package Java;

public class Main {

    public static void main(String[] args) {
        Eatable e=new Eatable() {
            @Override
            public void display() {
                System.out.println("Yes I did it!!!!!!!!");
            }
        };
        e.display();
	// write your code here
    }
}

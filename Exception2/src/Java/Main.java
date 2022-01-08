package Java;

public class Main {

    public static void main(String[] args) {
        try{
            int[] a=new int[4];
            a[4]=10;
        }
        catch (ArithmeticException e1){
            System.out.println("Exception: "+e1.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Exception: "+e1.getMessage());
        }

        System.out.println("Last line of the program");
	// write your code here
    }
}

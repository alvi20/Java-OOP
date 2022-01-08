package Java;

public class Main {

    public static void main(String[] args) {
      try{
          int x=10;
          int y=0;

          int z=x/y;
          System.out.println(x/y);
      }
      catch (ArithmeticException e){
          System.out.println("Exception: "+e);
      }
        System.out.println("Last line of the program");





	// write your code here
    }
}

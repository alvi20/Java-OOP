package Java;

public class Main {

    public static void test(){
        try{
            throw new IllegalArgumentException("Throwing another exception");
        }

        catch (ArithmeticException e){
            System.out.println("Catch from the test: "+e.getMessage());
        }
        finally {
            System.out.println("Finally from test method");
        }
        System.out.println("After Finally from test method");
    }


    public static void main(String[] args) {
        try{
            test();
        }

        catch (Exception e){
            System.out.println("Catch from main: "+e.getMessage());
        }

    }


}

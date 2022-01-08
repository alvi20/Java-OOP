package Java;

public class Main {


    public static void test(){

        try{
            throw new ArithmeticException("Throwing an Exception");
        }

        catch (ArithmeticException e){
            System.out.println("Catch from test: "+e.getMessage());
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

        catch (Exception e) {
            System.out.println("Catch from main: " + e.getMessage());
        }

    }



}

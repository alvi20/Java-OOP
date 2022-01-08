package Java;

public class Main {

    public static void main(String[] args) {

        checkAge(15);

    }
    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access Granted");
        }

        else{
            System.out.println("Access Denied");
        }

    }
}

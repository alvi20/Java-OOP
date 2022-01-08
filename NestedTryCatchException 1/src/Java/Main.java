package Java;

public class Main {

    public static void main(String[] args) {
        int  course[]=new int[10];

        try{
            System.out.println("Outer Try block");

            try{
                System.out.println("Start Change");
                course[10]=1;
                System.out.println("End Change");
            }
            catch (ArrayIndexOutOfBoundsException e1){
                System.out.println("InnerCatch: "+e1.getMessage());
            }

        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Outer Catch: "+e1.getMessage());
        }

	// write your code here
    }
}

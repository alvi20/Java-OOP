package Java;

public class Main {

    public static void main(String[] args) {
        int course[]=new int[10];
        try{
            System.out.println("Outer Try block");
            try{
                System.out.println("Start Change");
                course[10]=1;
                System.out.println("End Change");
            }
            catch (NumberFormatException e){
                System.out.println("InnerCatch is: "+e.getMessage());
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("OuterCatch is: "+e.getMessage());
        }
	// write your code here
    }
}

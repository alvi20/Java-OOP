package Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count=1;
do {
    try{
        Scanner input=new Scanner(System.in);
        System.out.println("Please input num1: ");
        int num1=input.nextInt();
        System.out.println("Please input num2: ");
        int num2=input.nextInt();
        int result=num1/num2;
        System.out.println("Result: "+result);
        count=2;

    }

    catch (Exception e){
        System.out.println("Exception: "+e);
        System.out.println("You must enter integer,please try again");
    }


}
while(count==1);





	// write your code here
    }
}

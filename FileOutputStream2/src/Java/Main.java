package Java;

import java.io.FileOutputStream;


public class Main {

    public static void main(String[] args) {
    try{
        FileOutputStream fout2=new FileOutputStream("E://OOP Programming//FileOutputStream2//testout2.txt");

        fout2.write(65);
        fout2.close();
        System.out.println("Done.....");
    }catch(Exception e){
        System.out.println(e);
    }

	// write your code here
    }
}

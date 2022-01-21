package Java;

import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("E://OOP Programming//testout.txt");
            fout.write(45);
            fout.close();
            System.out.println("Success...");
        }catch (Exception e){
            System.out.println(e);
        }

	// write your code here
    }
}

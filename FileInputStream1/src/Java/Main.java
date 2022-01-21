package Java;

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
        try{

            FileInputStream fin=new FileInputStream("E://OOP Programming//FileInputStream1//testin.txt");
            int i=fin.read();
            System.out.println((char)i);
            fin.close();

        }catch (Exception e){
            System.out.println(e);
        }




	// write your code here
    }
}

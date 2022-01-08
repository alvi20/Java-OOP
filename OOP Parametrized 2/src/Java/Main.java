package Java;

import static Java.Teacher.teacher1;
import static Java.Teacher.teacher2;


public class Main {

    public static void main(String[] args) {
       teacher1=new Teacher();

       teacher1.setInformation("Md.Ahanaf Alvi","Male",1739288997);
       teacher1.displayInformation();


       teacher2=new Teacher();
	   teacher2.setInformation("Anisul Islam","Male",1739288997);
       teacher2.displayInformaation();
    }
}

package Inheritence;

public class Main {

    public static void main(String[] args) {
        Parent  Parent=new Parent();

        Parent Parent1 =new  Parent();



        Parent  Parent2 =new Parent("Alvi","Male");
        Parent2.displayinformation();

        Parent Parent3=new Parent("Sajid","Male",1739288997);
        Parent3.displayinformation();

        Child Child=new Child("Rahim","Male",1783524234,"HSC");
        Child.displayInformation1();
	// write your code here
    }
}

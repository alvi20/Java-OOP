package Java;

public class Teacher {
    public static Teacher teacher1;

    String name1,gender1;
    int number1;

    void setInformation(String n1,String g1,int ph1){
        name1=n1;
        gender1=g1;
        number1=ph1;
    }
    void displayInformation(){
        System.out.println("Name is: "+name1);
        System.out.println("Gender is: "+gender1);
        System.out.println("Number is: "+number1);
    }
    public static Teacher teacher2;
    String name2,gender2;
    int number2;

    void displayInformation(){
        System.out.println("Name is: "+name2);
        System.out.println("Gender is: "+gender2);
        System.out.println("Number is: "+number2);
    }


}

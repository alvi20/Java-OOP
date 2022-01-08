package Java;

public class Teacher {
    public static Teacher teacher1;
    String name,gender;
    int number;
    void setInformation(String n,String m,int ph){
        name=n;
        gender=m;
        number=ph;

    }
    void displayInformation(){
        System.out.println("Name is: "+name);
        System.out.println("Gender is: "+gender);
        System.out.println("Number is: "+number);

    }

}

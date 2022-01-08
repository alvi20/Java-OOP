package Java;

public class Teacher {
    public static Teacher teacher1;

    String name,gender;
    int number;

    Teacher(String n, String g, int p){
        name=n;
        gender=g;
        number=p;
    }
    void displayInformation(){
        System.out.println("Name is: "+name);
        System.out.println("Gender is: "+gender);
        System.out.println("Number is: "+number);
    }



}

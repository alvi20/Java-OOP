package Java;

public class Test {
    String testName;
    float score;

    Test(String n,float s){
        testName=n;
        score=s;
    }

    void display(){
        System.out.println("Test Name: "+testName+score);
    }
}

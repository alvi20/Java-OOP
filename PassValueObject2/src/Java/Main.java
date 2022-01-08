package Java;

public class Main {

    public static void main(String[] args) {
        Test t=new Test("CT1",10);
        t.display();
        updateScore(t,15.0f);
        System.out.println("After Update");
        t.display();


	// write your code here
    }
    static void updateScore(Test test,float newScore){
        test.score=newScore;
    }
}

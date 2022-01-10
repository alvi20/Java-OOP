package Java;

public class TestMemberOuter {

    public void show(){
        System.out.println("Show Method");
        Innner inner=new Innner();
        inner.msg();
        System.out.println("End show of  method");

    }
    class Innner {

        private void msg() {
            System.out.println("Inner method");
        }
    }



}

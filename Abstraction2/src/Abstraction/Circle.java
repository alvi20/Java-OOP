package Abstraction;

public class Circle extends Shape {
    double r;

    Circle(double r) {

        super(r,r);
    }

    @Override
    void area() {
        double result=Math.PI*dim1*dim2;
        System.out.println("Circle is: "+result);
    }
}

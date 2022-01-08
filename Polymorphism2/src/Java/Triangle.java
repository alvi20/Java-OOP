package Java;

public class Triangle extends Shape{
    double height;
    double base;

    Triangle(double height,double base){
        this.height=height;
        this.base=base;
    }

    double area(){
        return 0.5*height*base;
    }
}

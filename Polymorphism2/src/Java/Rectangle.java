package Java;

public class Rectangle extends Shape {
    double height;
    double width;
    Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    double area(){
        return height*width;
    }



}

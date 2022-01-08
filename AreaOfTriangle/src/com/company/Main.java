package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double b,h,area;
        System.out.println("Enter Base: ");
        b=input.nextDouble();
        System.out.println("Enter Height: ");
        h= input.nextDouble();

        area=0.5*b*h;
        System.out.println("Area of Triangle is: "+area);

	// write your code here
    }
}

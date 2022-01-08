package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y;


        System.out.println("Enter two integer number: ");
        x= input.nextInt();
        y= input.nextInt();


        x+=y;
        System.out.println("x is ="+x);
        x-=y;
        System.out.println("x is ="+x);
        x*=y;
        System.out.println("x is ="+x);
        x/=y;
        System.out.println("x is ="+x);

	// write your code here
    }
}

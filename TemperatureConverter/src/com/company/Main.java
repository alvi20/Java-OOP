package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double celcius,F;
        System.out.println("Enter Celcius Degree: ");
        celcius=input.nextDouble();

        F=1.8*celcius+32;
        System.out.println("Farenheight Temperature: "+F);
	// write your code here
    }
}

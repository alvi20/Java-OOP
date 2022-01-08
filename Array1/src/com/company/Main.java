package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] number=new double[5];
        double sum=0;

        System.out.println("Enter five numbers: ");
        for(int i=0;i<5;i++){
            number[i]=input.nextDouble();
        }
        for(int i=0;i<5;i++){
            sum=sum+number[i];
        }


        System.out.println("Sum is: "+sum);

	// write your code here
    }
}

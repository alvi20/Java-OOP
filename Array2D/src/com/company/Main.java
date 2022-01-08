package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] number=new int[4][5];

        int k=0;
        int row,col;

        for(col=0;col<4;col++){
            for(row=0;row<5;row++){
                number[col][row]=k;
                k++;
            }
        }
        for(col=0;col<4;col++){
            for(row=0;row<5;row++){
                System.out.print(" "+number[col][row]);
            }
            System.out.println();
        }


        // write your code here
    }
}





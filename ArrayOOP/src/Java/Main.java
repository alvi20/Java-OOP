package Java;

public class Main {

    public static void main(String[] args) {
        int[][] matrixA={{1,2,3,4},{5,6,7,8},{0,1,2,3}};
        int [][] matrixB={{5,6,4,2},{1,1,1,1},{2,2,2,2}};
        int [][] matrixSum=new int[3][4];

        for(int row=0;row<3;row++){
            for(int col=0;col<4;col++){
                matrixSum[row][col]=matrixA[row][col]+matrixB[row][col];
            }
        }
        for(int row=0;row<3;row++){
            for(int col=0;col<4;col++){
                System.out.println(matrixSum[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("_____________________________________");

        int[][] zigzagarray={{3,4,5,6},{3,2},{6,7,8}};
        for(int row=0;row< zigzagarray.length;row++){
            for(int col=0;col<zigzagarray[row].length;col++){
                System.out.println(zigzagarray[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("_____________________________________");

	// write your code here
    }
}

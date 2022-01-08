public class Array2D {
    public static void main(String[] args) {
        int[][] number=new int[4][5];
        int k=0;
        int row,col;

        for(row=0;row<4;row++){
            for(col=0;col<5;col++){
                number=[row][col]=k;
                k++;
            }
        }
        for(row=0;row<4;row++){
            for(col=0;col<5;col++){
                System.out.println(" "+number[row][col]);
            }
            System.out.println();
        }
    }
}
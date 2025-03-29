import java.util.Scanner;
public class multiplyMatrices {
    public static void main(String[] args) {
        int firstCol,firstRow,secondCol,secondRow;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first matrix's row number");
        firstRow=sc.nextInt();
        System.out.println("Enter the first matrix's col number");
        firstCol=sc.nextInt();
        int[][] firstMatrix=new int[firstRow][firstCol];
        for(int i=0;i<firstRow;i++){
            for(int j=0;j<firstCol;j++){
                System.out.println("now you are entering first matrix "+i+" row's number " +j+"col's number");
                firstMatrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix's row number");
        secondRow=sc.nextInt();
        System.out.println("Enter the second matrix's col number");
        secondCol=sc.nextInt();

        int[][] secondMatrix=new int[secondRow][secondCol];
        for(int i=0;i<secondRow;i++){
            for(int j=0;j<secondRow;j++){
                System.out.println("now you are entering second matrix "+i+" row's number " +j+"col's number");
                secondMatrix[i][j]=sc.nextInt();
            }
        }
        if(firstCol==secondRow){
            int[][] thirdMatrix = new int[firstMatrix.length][secondMatrix[0].length];
            for (int i = 0; i < firstMatrix[0].length; i++) {
                for (int j = 0; j < secondMatrix.length; j++)
                    thirdMatrix[i][j] = firstMatrix[i][j] * secondMatrix[j][i];
            }
            //print fit format for matrix
            for (int i = 0; i < thirdMatrix.length; i++) {
                for (int j = 0; j < thirdMatrix[0].length; j++)
                    System.out.print(thirdMatrix[i][j] + " ");
                System.out.println("\n");
            }
        }
        else
            System.out.println("Your matrices format not fit for multiply two Matrix");
    }
}

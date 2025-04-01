public class rubikMatrix {
    public static void main(String[] args) {
        int[][] firstMatrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = firstMatrix.length;
        int[][] secondMatrix=new int[firstMatrix.length][firstMatrix[0].length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix.length; j++) {
                secondMatrix[i][j]=firstMatrix[j][i];
            }
        }
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j <n/2; j++) {
                int copy=secondMatrix[i][j];
                secondMatrix[i][j]=secondMatrix[i][n-j-1];
                secondMatrix[i][n-j-1]=copy;
            }
        }
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[0].length; j++)
                System.out.print(secondMatrix[i][j] + " ");
            System.out.println("\n");
        }
    }
}

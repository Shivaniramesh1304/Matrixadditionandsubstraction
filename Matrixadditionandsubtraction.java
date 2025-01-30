public class Matrixadditionandsubtraction{
        public static void main(String[]args){
            int[][]matrix1={
                {1,2},{3,4}
            };
            int[][]matrix2={
                {5,6},{7,8}
            };
            int rows=2,cols=2;
            int[][] additionresult=new int[rows][cols];
            int[][] subtractionresult=new int[rows][cols];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    additionresult[i][j]=matrix1[i][j]+matrix2[i][j];
                    subtractionresult[i][j]=matrix1[i][j]-matrix2[i][j];
                }
            }
            System.out.println("matrix addition:");
            printmatrix(additionresult);
            System.out.println("matrix subtraction:");
            printmatrix(subtractionresult);
        }
        private static void 
        printmatrix(int[][] matrix){
            for(int[]row:matrix){
                for(int element:row){
                    System.out.print(element+ " ");
                }
                System.out.println();
            }
        }
    }
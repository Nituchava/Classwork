package com.javaarray;

public class DemoArray {
    public static void main(String[] args) {
        char[][] matrix ={{'x','o','x'},{'o','x','o'},{'x','o','x'}};
      //  MultiDaiArray multiDaiArray = new MultiDaiArray();
      //  multiDaiArray.matrixMethod(matrix);
        matrixMethod(matrix);

    }


    public static void matrixMethod(char[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}

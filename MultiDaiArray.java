package com.javaarray;

public class MultiDaiArray {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{2,3,4},{5,6,7}};
MultiDaiArray multiDaiArray = new MultiDaiArray();
multiDaiArray.matrixMethod(matrix);
    }
    public static void matrixMethod(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}

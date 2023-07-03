package com.coding.school.matrix;

public class PrintMatrixInSpiral {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {3,4,5,6},
                {9,4,0,6}
        };
        printMatrix(mat);
    }

    private static void printMatrix(int[][] mat) {
        if(mat==null || mat.length==0){
            return;
        }

        int top =0, bottom = mat.length -1;
        int left = 0, right = mat[0].length -1;
        while (true){
            if(left>right){
                break;
            }
            //print top row
            for (int i = left; i <= right; i++) {
                System.out.println(mat[top][i] + " ");
            }
            top++;
            if(top>bottom){
                break;
            }
            //print right column
            for (int i = top; i <=bottom ; i++) {
                System.out.println(mat[i][right] + " ");
            }
            right--;
            if(left>right){
                break;
            }
            //print bottom row
            for (int i = right; i >=left ; i--) {
                System.out.println(mat[bottom][i]+" ");
            }
            bottom --;

            if(top>bottom){
                break;
            }
            //print left column
            for (int i = bottom; i >= top ; i--) {
                System.out.println(mat[i][left]+ " ");
            }
            left++;
        }
    }
}

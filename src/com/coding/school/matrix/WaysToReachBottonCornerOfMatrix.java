package com.coding.school.matrix;

public class WaysToReachBottonCornerOfMatrix {
    public static void main(String[] args) {
        int M =3 , N=3;
        int turns = 2;
        System.out.println("Total Number of ways is "+totalWays(M,N,turns));
    }

    private static int totalWays(int m, int n, int turns) {
        int i =0 , j=0;
        return  totalWays(m,n,i+1,j,turns,true) + totalWays(m,n,i,j+1,turns,false);
    }

    private static int totalWays(int m, int n, int i, int j,int turns, boolean isCol) {
        if(turns==-1 || !isValid(i,j,m,n)){
            return 0;
        }
        if(turns == 0 && i == m-1 && j == n-1){
            return 1;
        }
        if(isCol){
            return totalWays(m,n,i+1,j,turns,true) +totalWays(m,n,i,j+1,turns-1,false);
        }

        return totalWays(m,n,i,j+1,turns,false) +totalWays(m,n,i+1,j,turns-1,true);
    }

    private static boolean isValid(int i, int j, int m, int n) {
        return (i>=0 && i<m && j>=0 && j<n);
    }
}

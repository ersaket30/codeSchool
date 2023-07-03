package practice.datastructure;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] myArray = {64 ,25 ,12 ,22, 11};
        mergeSort(myArray,0,myArray.length-1);
        System.out.println(Arrays.toString(myArray));
    }

    private static void mergeSort(int[] myArray, int l, int r) {
        if (l<r) {
            int m = l + (r - l) / 2;
            mergeSort(myArray, l, m);
            mergeSort(myArray, m + 1, r);
            merge(myArray, l, m, r);
        }
    }

    private static void merge(int[] myArray, int l, int m, int r) {
        int[] L = new int[m-l+1];
        int[] R = new int[r-m];

        for (int i = 0; i < m-l+1; i++) {
            L[i] = myArray[l+i];
        }
        for (int i = 0; i < r-m; i++) {
            R[i] = myArray[m+1+i];
        }

        int n1=0;
        int n2=0;
        int k = l;
        while (n1<L.length && n2<R.length){
            if(L[n1]<=R[n2]){
                myArray[k]=L[n1];
                n1++;
            }else{
                myArray[k]=R[n2];
                n2++;
            }
            k++;
        }

        while (n1<L.length){
            myArray[k]=L[n1];
            n1++;
            k++;
        }
        while (n2<R.length){
            myArray[k]=R[n2];
            n2++;
            k++;
        }
    }
}

package com.coding.school.arrays;

public class FindDuplicateTwoArrays {



    public static void main(String args[])
    {
        FindDuplicateTwoArrays ob = new FindDuplicateTwoArrays();

        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        //int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.print("Common elements are ");
        ob.findCommon(ar1, ar2);
    }

    private void findCommon(int[] ar1, int[] ar2) {
        int i=0,j=0;
        while (i < ar1.length && j < ar2.length){
            if(ar1[i]==ar2[j]){
                System.out.println(ar1[i]);
                i++;
                j++;
            } else if(ar1[i]<ar2[j]) i++;
            else j++;
        }
    }
}

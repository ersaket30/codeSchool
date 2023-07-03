package com.coding.school.arrays;

import java.util.Arrays;

public class TwoSumProblem {

    static void
    hasArrayTwoCandidates(int A[], int arr_size, int sum)
    {
        int l, r;

        /* Sort the elements */
        Arrays.sort(A);

        /* Now look for the two candidates
        in the sorted array*/
        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (A[l] + A[r] == sum) {
                System.out.println("pairs are " + A[l] + " " + A[r]);
                l++;
                r--;
            }
            else if (A[l] + A[r] < sum)
                l++;
            else // A[i] + A[j] > sum
                r--;
        }
    }

    // Driver code
    public static void main(String args[])
    {
        int A[] = { 1, 4, 45, 6, 10, -8,12,15,-29 };
        int n = 16;
        int arr_size = A.length;

        // Function calling
        hasArrayTwoCandidates(A, arr_size, n);
    }
}

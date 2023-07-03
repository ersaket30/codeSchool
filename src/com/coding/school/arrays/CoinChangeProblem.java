package com.coding.school.arrays;

public class CoinChangeProblem {
    // Function to find the total number of distinct ways to get
    // a change of `target` from an unlimited supply of coins in set `S`
    public static int count(int[] S, int n, int target)
    {
        // if the total is 0, return 1 (solution found)
        if (target == 0) {
            return 1;
        }

        // return 0 (solution does not exist) if total becomes negative,
        // no elements are left
        if (target < 0 || n < 0) {
            return 0;
        }

        // Case 1. Include current coin `S[n]` in solution and recur
        // with remaining change `target-S[n]` with the same number of coins
        int incl = count(S, n, target - S[n]);

        // Case 2. Exclude current coin `S[n]` from solution and recur
        // for remaining coins `n-1`
        int excl = count(S, n - 1, target);

        // return total ways by including or excluding current coin
        return incl + excl;
    }

    // Coin Change Problem
    public static void main(String[] args)
    {
        // `n` coins of given denominations
        int[] S = { 1, 2, 5 };

        // total change required
        int target = 11;

        System.out.print("The total number of ways to get the desired change is "
                + count(S, S.length - 1, target));
    }
}


package com.coding.school.arrays;

public class MinimunJump {

    static int minJump(int nums[], int n) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJump(arr,arr.length));
    }
}

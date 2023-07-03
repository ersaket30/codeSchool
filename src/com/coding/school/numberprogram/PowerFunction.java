package com.coding.school.numberprogram;

public class PowerFunction {

    static int power(int x, int y)
    {
        int temp;
        if( y == 0)
            return 1;
        temp = power(x, y / 2);
        if (y % 2 == 0)
            return temp*temp;
        else
            return x*temp*temp;
    }

    /* Program to test function power */
    public static void main(String[] args)
    {
        int x = 2;
        int y = 9;
        System.out.printf("%d", power(x, y));
    }
}

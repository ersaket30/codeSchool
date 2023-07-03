package com.coding.school;

import java.time.LocalDate;

public class DateComparision {
    public static void main(String[] args) {
        String date1 = "2021-01-01";
        String date2 = "2021-02-02";

       int value =  LocalDate.parse(date1).plusDays(1).compareTo(
                LocalDate.parse(date2));
       System.out.println("Value is "+value);
    }
}

package com.coding.school;


import java.util.Objects;

public class FindTotalSumFromString {

    public static void main(String[] args) {
        String input = "#1 Tickets $50,000 Received $40. Expenses $800 . Cheque$2,00,000.";
        int sum = calculateSum(input);
        System.out.println("sum is"+sum);
    }

    private static int calculateSum(String input) {

        String[] str1 = input.split("\\$");
        int sum = 0;
        for(int i = 0 ; i<str1.length;i++){
            char[] strChar = str1[i].toCharArray();
            StringBuffer stringBuffer = new StringBuffer();
            for(int j=0; j<strChar.length; j++){
                try {
                    if(strChar[j]==','){
                        continue;
                    }
                    stringBuffer.append(Integer.valueOf(String.valueOf(strChar[j])));
                } catch (NumberFormatException ex){
                    break;
                }

            }
            String computedString = stringBuffer.toString().replaceAll(",","");
            try {
                sum = sum + Integer.valueOf(computedString);
            }catch (NumberFormatException ex)
            {
                continue;
            }

        }
        return sum;
    }
}

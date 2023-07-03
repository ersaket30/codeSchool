package com.coding.school;

public class ChessBoardProblem {

    public static void main(String[] args) {

        String input = "bf9";
        System.out.println(ChessBoardProblem.findColour(input));
    }

    private static String findColour(String input) {
        char[] charInput = input.toCharArray();
        if (charInput[0] == 'a' || charInput[0] == 'c' || charInput[0] == 'e' || charInput[0] == 'g') {
            if (charInput[1] == '1' || charInput[1] == '3' || charInput[1] == '5' || charInput[1] == '7')
                return "Black square";
            else
                return "White square";
        }

        if (charInput[0] == 'b' || charInput[0] == 'd' || charInput[0] == 'f' || charInput[0] == 'h') {
            if (charInput[1] == '1' || charInput[1] == '3' || charInput[1] == '5' || charInput[1] == '7')
                return "white square";
            else
                return "Black square";
        } else {
            return "error";
        }
    }

}

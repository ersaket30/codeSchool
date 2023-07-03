package com.coding.school.stringprograms;

public class Permutations {
    public static void main(String[] args) {
        String name = "TOM";
        getPermutations(name,0,name.length()-1);
    }

    private static void getPermutations(String name, int l, int r) {
        if(l==r){
            System.out.println(name);
        }
        else{
            for (int i = l; i <= r; i++) {
                name = swap(name,l,i);
                getPermutations(name,l+1,r);
            }
        }
    }

    private static String swap(String name, int l, int i) {
        char[] ch = name.toCharArray();
        char tmp = ch[l];
        ch[l] = ch[i];
        ch[i] = tmp;
        return String.valueOf(ch);
    }
}

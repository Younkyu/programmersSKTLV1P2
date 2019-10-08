package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean solution(int x) {
        String[] str = String.valueOf(x).split("");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            count += Integer.parseInt(str[i]);
        }
        if(x % count == 0) return true;
        else return false;
    }
}

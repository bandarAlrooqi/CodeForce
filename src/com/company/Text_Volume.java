package com.company;

import java.util.Scanner;

public class Text_Volume {
    static Scanner r=new Scanner(System.in);
    public static void main(String[] args) {
        r.nextLine();
        String []text=r.nextLine().split(" ");
        int max=0;
        int count=0;
        for (int i = 0; i <text.length ; i++) {
            count=0;
            for (int j = 0; j <text[i].length() ; j++) {
                if(Character.isUpperCase(text[i].charAt(j)))
                    count++;
            }
            max=Math.max(max,count);
        }
        System.out.print(max);
    }
}

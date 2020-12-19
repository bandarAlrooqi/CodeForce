package com.company;

import java.util.Scanner;

public class Nearest_Interesting_Number {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       int x =r.nextInt();
        while (true){
            String m=String.valueOf(x);
            double y=0;
            for (int i = 0; i <m.length() ; i++) {
                y+=Integer.parseInt(String.valueOf(m.charAt(i)));
            }
            if(y%4 ==0){
                System.out.println(x);
                return;
            }
        }
    }
}

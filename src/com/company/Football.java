package com.company;

import java.util.Scanner;

public class Football {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String m =r.nextLine();
        int x=0,y=0;
        for (int i = 0; i <m.length() ; i++) {
            if(m.charAt(i)=='0'){
                x++;
                y=0;
            }else {
                y++;
                x=0;
            }
            if(y>=7||x>=7) {
                System.out.println("YES");
                return;
            }
        }
            System.out.println("NO");
    }
}

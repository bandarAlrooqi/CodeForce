package com.company;

import java.util.Scanner;

public class Case_of_the_Zeros_and_Ones {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        r.nextLine();
        char[] m=r.nextLine().toCharArray();
        int ones=0;
        int zero=0;
        for (int i = 0; i <m.length ; i++) {
            if(m[i]=='0')
                zero++;
            else
                ones++;
        }
        if(ones>zero){
            ones-=zero;
            System.out.println(ones);
        }
        else {
            zero-=ones;
            System.out.println(zero);
        }
    }
}

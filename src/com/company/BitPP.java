package com.company;

import java.util.Scanner;

public class BitPP {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n =r.nextInt();
        r.nextLine();
        int sum=0;
        for (int i = 0; i <n ; i++) {
            if(r.nextLine().indexOf("+")!=-1)
                sum++;
            else
                sum--;
        }
        System.out.println(sum);
    }
}

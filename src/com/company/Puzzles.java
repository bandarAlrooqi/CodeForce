package com.company;

import java.util.Scanner;

public class Puzzles {

    public static void main(String[] args) {
        Scanner r =new Scanner(System.in);
        int[][]a =new int[3][10];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j]=r.nextInt();
                if(i==0&&j==0) System.out.println();
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

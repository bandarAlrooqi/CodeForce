package com.company;

import java.util.Scanner;

public class AOnB_Matrix {//Time limit on 5ith test case ,, This is not my original solution
    static Scanner r = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases=r.nextInt();

        for (int i = 0; i <testCases ; i++) {
            int n=r.nextInt(),m=r.nextInt(),a=r.nextInt(),b=r.nextInt();
            if(n*a!=m*b){
                System.out.println("NO");
                break;
            }
            System.out.println("YES");
            print(n,m,a);
        }
        }
        public static void print(int n,int m,int a){
        int [][]num=new int[n][m];
            for (int i = 0; i < a*n; i++)
            num[i/a][i%m]=1;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    System.out.print(num[i][j]);
                }
                System.out.println();
            }
        }
    }
package com.company;

import java.util.Scanner;

public class Team{

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       int x= r.nextInt();int count=0;
        while (x!=0){
            int[]sum=new int[3];
            for (int i = 0; i <3 ; i++) {
                sum[i]=r.nextInt();
            }
            int zg=0;
            for(int i : sum)
                zg+=i;
            if(zg>1)
                count++;
            x--;
        }

    }
}

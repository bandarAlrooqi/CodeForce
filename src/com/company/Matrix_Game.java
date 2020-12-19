package com.company;

import java.util.Scanner;

public class Matrix_Game {
    static Scanner r = new Scanner(System.in);
    public static void main(String[] args) {
        var t =r.nextInt();
        for (int i = 0; i <t ; i++) {
            int[] row =new int[r.nextInt()];
            int[] c =new int [r.nextInt()];
            int x=row.length;
            int y=c.length;
            for (int j = 0; j <row.length; j++) {
                for (int k = 0; k <c.length; k++) {
                  if(r.nextInt()==1){
                      row[j]=1;
                      c[k]=1;
                  }
                }

            }
            for(var j :row)
                if(j==1)
                x--;

            for(var k:c)
                if(k==1)
                y--;
            System.out.println(((Math.min(x,y))%2==0)?"Vivek":"Ashish");
        }
    }
}

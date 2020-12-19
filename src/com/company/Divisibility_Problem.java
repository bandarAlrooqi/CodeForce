package com.company;

import java.util.Scanner;

public class Divisibility_Problem {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        r.nextInt();
        while (r.hasNext()){
            int a =r.nextInt();
            int b=r.nextInt();
          if (a%b==0){
              System.out.println("0");
          }
          else
              System.out.println((b-(a%b)));
        }

    }
}

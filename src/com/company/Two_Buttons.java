package com.company;

import java.util.Scanner;

public class Two_Buttons {//This is not my original solution
    static Scanner r = new Scanner(System.in);

    public static void main(String[] args) {
        int n = r.nextInt();
        int m = r.nextInt();
        int count = 0;
        if (n >= m)
            System.out.print(n - m);
         else {
            while (n != m) {
                if (m % 2 == 0 && m >= n) m /= 2;
                else m++;
                count++;
            }
            System.out.print(count);
        }
    }
}

package com.company;

import java.util.Scanner;

public class Repeating_Cipher {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        r.nextInt();
        String m= r.next();
        String f =m.charAt(0)+m.charAt(1)+"";
        for (int i = 0; i <m.length() ; i++) {
            f+=m.charAt(i);

        }
        System.out.println(f);
    }
}

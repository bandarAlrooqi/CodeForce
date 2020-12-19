package com.company;

import java.util.Scanner;

public class Candies_and_Two_Sisters {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
       r.nextInt();
        while (r.hasNext()){
            System.out.println(((r.nextInt()-1)/2));
       }
    }
}

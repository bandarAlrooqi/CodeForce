package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    static Scanner r = new Scanner(System.in);

    public static void main(String[] args) {
        int x = Integer.parseInt(r.nextLine());

        if (x < 26) {
            System.out.println("NO");
            return;
        }

        String input = r.nextLine();
        Set<Character> set = new HashSet<>();
        for (var i : input.toLowerCase().toCharArray())
            set.add(i);
        System.out.println((set.size() != 26) ? "NO" : "YES");
    }
}

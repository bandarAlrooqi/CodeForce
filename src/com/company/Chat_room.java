package com.company;

import java.util.Scanner;

public class Chat_room {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String m = r.nextLine();
        int o =0;
        for ( int i=0 ; i <m.length() ; i++) {
            if (m.charAt(i) == 'h' && o == 0) o++;
            else if (m.charAt(i) == 'e' && o == 1) o++;
            else if (m.charAt(i) == 'l' && o == 2 || o == 3) o++;
            else if (m.charAt(i) == 'o' && o == 4) o++;
        }
        if(o==5) System.out.println("YES");
        else
        System.out.println("NO");
}}
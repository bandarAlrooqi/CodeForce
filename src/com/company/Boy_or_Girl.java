package com.company;

import java.util.Scanner;

public class Boy_or_Girl {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String m =r.nextLine();
        String newM="";
        for (int i = 0; i <m.length() ; i++) {
            if(!newM.contains(m.charAt(i)+""))
                newM+=m.charAt(i);
        }
      if ((newM.length())%2==0){
          System.out.println("CHAT WITH HER!");
          return;
      }
        System.out.println("IGNORE HIM!");
    }
}

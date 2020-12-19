package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Helpful_Maths {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String m =r.nextLine();
        StringBuilder newM=new StringBuilder("");
        ArrayList<Integer>numbers=new ArrayList<>();
        ArrayList<Integer>plus=new ArrayList<>();
        for (int i = 0; i <m.length() ; i++) {
         if (Character.isDigit(m.charAt(i)))
          numbers.add(Integer.parseInt(m.charAt(i)+""));
         else
            plus.add(i);
        }
        numbers.sort(Comparator.naturalOrder());
        for(int n:numbers)
            newM.append(n);
        for (int i = 0; i <plus.size() ; i++)
            newM.insert(plus.get(i),"+");
        System.out.println(newM);
    }
}

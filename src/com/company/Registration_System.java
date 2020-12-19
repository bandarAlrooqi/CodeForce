package com.company;
import java.util.*;
public class Registration_System {
    public static void main(String[] args) {
        Scanner r =new Scanner(System.in);
        var list =new HashMap<String, Integer>();
        String n =r.nextLine();
        for (int i = 0; i <Integer.parseInt(n) ; i++) {
            String m =r.nextLine();
            if(list.containsKey(m)) {
                list.put(m,list.get(m)+1);
                System.out.println(m+list.get(m));
            }
            else {
                list.put(m, 0);
                System.out.println("OK");
            }
        }
    }
}

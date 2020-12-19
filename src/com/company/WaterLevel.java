package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class WaterLevel { // time limit on test 6
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        long k =in.nextLong(),l=in.nextLong(),r=in.nextLong(),t=in.nextLong(),x=in.nextLong(),y=in.nextLong();
        HashSet<Long> set = new HashSet<>();
        int i =0;
        while ( t != 0 ){
          if (set.contains(k)||(k < l))break;
            if (i == 5) {
                set.add(k);
                i=0;
            }
            if ((y + k) >= l && (y + k) <=r)
                k += y;
            k-=x;
            t--;
            i++;
        }
        System.out.print((k<l||k>r)?"No":"Yes");
    }
}

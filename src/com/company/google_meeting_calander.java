package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class google_meeting_calander {
    static Scanner r = new Scanner(System.in);
    public static void main(String[] args) {

        String m = r.nextLine();
        String[] Fm=r.nextLine().split(",");

       long[] sorting=new long[Fm.length];

        for (int i = 0; i <sorting.length ; i++)
            sorting[i]=Long.parseLong(Fm[i]);

        Arrays.sort(sorting);

        int min=-1;
        String num="(";

        for (int i = sorting.length-1; i >=0 ; i--) {
            boolean x=m.contains(String.valueOf(sorting[i]))&&!(num.contains(String.valueOf(sorting[i])));
            if(x){
                num+=String.valueOf(sorting[i]);
                num+=" ";
                min++;
            }
        }
        System.out.println(min+num.substring(0,num.length()-1)+")");
    }
}

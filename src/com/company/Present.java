package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Present {

    public static void main(String[] args) throws IOException {
      BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(r.readLine());
        if(l==2){
            String zg []=r.readLine().split(" ");
            System.out.print(Integer.parseInt(zg[0])+Integer.parseInt(zg[1]));
            return;
        }
        int[]numbers=new int[l];
        String[] N =r.readLine().split(" ");
        ArrayList<String> sum=new ArrayList();
        for (int i = 0; i <numbers.length ; i++)
            numbers[i]=Integer.parseInt(N[i]);
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                sum.add(Integer.toBinaryString(numbers[i]+numbers[j]));
            }
        }
        r.close();
        String m="";int count;
        for (String s : sum) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1')
                    count++;
                if (count>1)
                    break;
            }
            if (count == 1)
                m += "1";
            else
                m += "0";
        }
        System.out.println(Integer.parseInt(m,2));
    }
}


package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CopyCopyCopyCopyCopy {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        r.nextLine();
        while (r.hasNext()){
            int[] array=new int[r.nextInt()];
            for (int i = 0; i <array.length ; i++) {
                array[i]=r.nextInt();
            }
            Arrays.sort(array);
            int count=array.length;
            for (int i = 1; i <array.length ; i++) {
                if(array[i-1]==array[i])
                    count--;
            }
            System.out.println(count);
        }
    }
}

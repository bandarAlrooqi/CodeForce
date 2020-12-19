package com.company;

import java.util.Scanner;

public class Beautiful_Matrix {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int index=-1;
        for (int i = 0; i <25 ; i++)
            if(r.nextInt()==1)
            index=i;
        switch (index){
            case 0:
            case 20:
            case 24:
            case 4:
                System.out.println(4);break;
            case 1:
            case 9:
            case 15:
            case 19:
            case 21:
            case 23:
            case 3:
            case 5:
                System.out.println(3);break;
            case 2:
            case 10:
            case 8:
            case 14:
            case 16:
            case 18:
            case 22:
            case 6:
                System.out.println(2);break;
            case 7:
            case 11:
            case 13:
            case 17:
                System.out.println(1);break;
            case 12:
                System.out.println(0);break;
        }
    }
}

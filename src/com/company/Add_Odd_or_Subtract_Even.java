package com.company;
import java.util.Scanner;
public class Add_Odd_or_Subtract_Even {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        r.nextInt();
        while (r.hasNext()){

        int one =r.nextInt();
        int two=r.nextInt();

        boolean x=(one-two)%2==0;
        boolean y=(two-one)%2!=0;

        if (one ==two )
            System.out.println(0);
        else
            System.out.println((one >two&&x||two>one &&y)?1:2);

    }}
}

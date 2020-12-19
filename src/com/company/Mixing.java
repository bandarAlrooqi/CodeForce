package com.company;
import java.util.*;
import java.util.regex.Pattern;

public class Mixing {
    public static void main(String[] args) {
        var i =Integer.parseInt("011",2);
        System.out.println((i%3)==0);
       var x =  Pattern.compile("1011");
        System.out.println(x);
    }



}

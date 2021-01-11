package com.company;
public class MagnetParticulesInBoxes { // CodeWars.com
    public static void main(String[] args){
        System.out.println(doubles(1, 10));
    }
    public static double doubles(int maxk, int maxn) {
        double sum =0;
        for (int i = 1; i <= maxk; i++) {
            for (int j = 1; j <=maxn ; j++) {
                sum += 1/(i*(Math.pow((j+1),2*i)));
            }
        }
        return sum;
        
    }
}

package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CodeWar {
    public static void main(String[] args){
        System.out.println(formatDuration(86402));
    }
    public static String formatDuration(int seconds) {
        return seconds == 0 ? "now" :
                Arrays.stream(
                        new String[]{
                                formatTime("year",  (seconds / 31536000)),
                                formatTime("day",   (seconds / 86400)%365),
                                formatTime("hour",  (seconds / 3600)%24),
                                formatTime("minute",(seconds / 60)%60),
                                formatTime("second",(seconds%3600)%60)})
                        .filter(e->e!="")
                        .collect(Collectors.joining(", "))
                        .replaceAll(", (?!.+,)", " and ");
    }
    public static String formatTime(String s, int time){
        return time==0 ? "" : time+ " " + s + (time==1?"" : "s");
    }
    public static int determinant(int[][] matrix) {

        if(matrix.length == 1)return matrix[0][0];
        if(matrix.length == 2)return matrix[0][0] * matrix[1][1] - (matrix[0][1] * matrix[1][0]);
        if(matrix.length == 3)return
                matrix[0][0] * (matrix[1][1] * matrix[2][2] - (matrix[1][2] * matrix[2][1])) -
                matrix[0][1] * (matrix[1][0] * matrix[2][2] - (matrix[1][2] * matrix[2][0])) +
                matrix[0][2] * (matrix[1][0] * matrix[2][1] - (matrix[1][1] * matrix[2][0]));

        int number = 0;
        for (int i = 0; i < matrix.length; i++) {

             int mul = determinant(Arrays.copyOfRange(removeCol(matrix,i),1,matrix.length));
            if(i %2 == 0) number+= matrix[0][i] * mul;
            else number += (-matrix[0][i]) * mul;

        }
        return number;
    }
    private static int[][] removeCol(int [][] array, int colRemove)
    {
        int row = array.length;
        int col = array[0].length;

        int [][] newArray = new int[row][col-1]; //new Array will have one column less


        for(int i = 0; i < row; i++)
        {
            for(int j = 0,currColumn=0; j < col; j++)
            {
                if(j != colRemove)
                {
                    newArray[i][currColumn++] = array[i][j];
                }
            }
        }

        return newArray;
    }
    public static String Factorial(int n) {
        if (n < 0) return null;

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial.toString();
    }
}

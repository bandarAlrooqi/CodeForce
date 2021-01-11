package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokuSolutionValidator { // codewars -- successful on the first try :)
    public static void main(String[] arg) {
        System.out.println(check(        new int[][] {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        }));
    }
    public static boolean check(int[][] sudoku) {
        Set<Integer> set = new HashSet<>();
        for (int[] value : sudoku) {
            for (int j = 0; j < sudoku.length; j++) {
                if (set.contains(value[j])) return false;
                set.add(value[j]);
            }
            set.clear();
        }
        for (int i = 0; i < sudoku.length; i++) {
            for (int[] ints : sudoku) {
                if (set.contains(ints[i])) return false;
                set.add(ints[i]);
            }
            set.clear();
        }

        if (checkM(sudoku,0 ,0, 3)) return false;
        if (checkM(sudoku,3 ,0, 3)) return false;
        if (checkM(sudoku,6 ,0, 3)) return false;
        if (checkM(sudoku,0 ,3, 6)) return false;
        if (checkM(sudoku,3 ,3, 6)) return false;
        if (checkM(sudoku,6 ,3, 6)) return false;
        if (checkM(sudoku,0 ,6, 9)) return false;
        if (checkM(sudoku,3 ,6, 9)) return false;
        return !checkM(sudoku, 6, 6, 9);
    }

    private static boolean checkM(int[][] sudoku,int index, int from, int to) {
        var a = new int[3][3];
        a[0] = Arrays.copyOfRange(sudoku[index],from,to);
        a[1]  = Arrays.copyOfRange(sudoku[index+1],from,to);
        a[2]  = Arrays.copyOfRange(sudoku[index+2],from,to);
        if(checkMatrix(a)){System.out.println(Arrays.deepToString(a));
            return true;
        }
        return false;
    }

    public static boolean checkMatrix(int[][] threeD){
        Set<Integer> set = new HashSet<>();
        for (var i : threeD)
            for(var j : i)
                if(set.contains(j) || j == 0)
                    return true;
                else
                    set.add(j);
        return false;
    }

}

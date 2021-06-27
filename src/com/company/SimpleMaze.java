package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SimpleMaze {
    public static void main(String[]args){
        System.out.println(hasExit(new String[] {"########",
                "# # ####",
                "# #k#   ",
                "# # # ##",
                "# # # ##",
                "#      #",
                "########"}));
    }
    public static String maze[];
    public static boolean visited[][];
    public static boolean hasExit(String[] maz) {

        int max = 0;
        maze = maz;
        int x =0;
        int y = 0;
        int b = 0;
        for(int i = 0;i<maz.length;i++){
            if(maz[i].length()>max)max=maz[i].length();
            for(int j = 0;j<maz[i].length();j++){
                System.out.print(maz[i].charAt(j));
                if(maz[i].charAt(j)=='k'){
                    x = i;
                    y = j;
                    b++;

                }
            }
            System.out.println();
        }
        visited = new boolean[maz.length][max];
        if(b!=1) throw new RuntimeException();
        return dfs(x,y);
    }
    public static boolean dfs(int x,int y){
        if(y>maze[x].length()-1)return true;
        if(maze[x].charAt(y)=='#')return false;
        if(x==0 || x==maze.length-1 || y==0||y==maze[x].length()-1)return true;
        if(visited[x][y])return false;
        visited[x][y] = true;
        if(dfs(x+1,y) || dfs(x-1,y) || dfs(x,y+1) || dfs(x,y-1))return true;
        return false;
    }
}


package com.company;


import java.util.*;

public class Closest_pair_of_points_in_linearithmic_time {  // CodeWars.com
    public static void main(String [] arg) {
        List<Point> points = Arrays.asList(
                new Point(2, 2), //A
                new Point(2, 8), //B
                new Point(5, 5), //C
                new Point(6, 3), //D
                new Point(6, 7), //E
                new Point(7, 4), //F
                new Point(7, 9)  //G
        );
       System.out.println(closestPair(points));
  }
    public static List<Point> closestPair(List<Point> points) {
        var list = new ArrayList<Point>();
        var point = new ArrayList<>(points);
        var point2 = new ArrayList<>(points);
        list.add(points.get(0));
        list.add(points.get(1));
        point2.remove(points.get(0));
        point2.remove(points.get(1));
        for(var i : point){
            for (Point j : point2) {
                if (i != j && i.equals(j)) return Arrays.asList(i, j);
                if (j != i && (Math.abs(i.x - j.x) +
                        Math.abs(i.y - j.y)) <=
                        (Math.abs(list.get(list.size() - 2).x - list.get(list.size() - 1).x) +
                                Math.abs(list.get(list.size() - 2).y - list.get(list.size() - 1).y))) {
                    list.add(i);
                    list.add(j);
                }
            }
            point2.remove(i);
        }
        return Arrays.asList(list.get(list.size()-1),list.get(list.size()-2));
    }
}
class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }

    @Override
    public int hashCode() {
        return Double.hashCode(x) ^ Double.hashCode(y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
    }
}
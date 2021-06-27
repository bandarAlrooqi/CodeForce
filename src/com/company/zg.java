package com.company;

import java.util.*;

class Student implements Comparable<Student> { // hackerRank Java problem
    private final Integer id;
    private final String name;
    private final Double cgpa;

    public Student(int id, String name, double cgpa) {
        this.cgpa = cgpa;
        this.id = id;
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public int compareTo(Student student) {
        return student.cgpa.compareTo(cgpa) != 0 ? student.cgpa.compareTo(cgpa) : name.compareTo(student.name) != 0 ? name.compareTo(student.name) : student.id.compareTo(id);
    }
}

class Priorities {
    Queue<Student> list = new PriorityQueue<>();
    public List<Student> getStudents(List<String> events) {
        for (String i : events) {
            String[] com = i.split(" ");
            if (com[0].equals("ENTER")) {
                list.add(new Student(Integer.parseInt(com[3]), com[1], Double.parseDouble(com[2])));
            } else list.remove();
        }
        List<Student> l = new ArrayList<>(list);
        l.sort(Comparator.naturalOrder());
        return l;
    }
}

public class zg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Priorities p = new Priorities();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        List<Student> names = p.getStudents(list);
        for (Student i : names)
            System.out.println( i.getName());
    }
}

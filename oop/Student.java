package oop;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void getInformation() {
        Scanner sc = new Scanner(System.in);

        name = sc.next();
        age = sc.nextInt();
    }
}

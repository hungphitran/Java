package oop;

/**
 * Student
 */
import java.util.Scanner;

class Student {

    String name;
    int age;

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

/**
 * InnerEntry
 */
class Rectangle {
    double width;
    double length;

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        length = sc.nextDouble();
    }

    public void display() {
        double area = width * length;
        double perimeter = 2 * (width + length);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

public class Entry {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getInformation();
        s1.display();
    }
}
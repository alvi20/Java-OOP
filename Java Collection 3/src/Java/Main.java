package Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}


public class Main {
    public static void main(String[] args) {

        // [1 3 1 2 4 1]
        // [1-2, 3-1, 2-1, 4-1]

        try {
            ArrayList<Student> students = new ArrayList();

            students.add(new Student("A", 2, 3.88));
            students.add(new Student("B", 3, 3.88));
            students.add(new Student("C", 4, 3.5));
            students.add(new Student("Ba", 41, 3.9));

            System.out.println("--------Before Sorting--------");
            printStudentData(students);
            System.out.println("--------After Sorting--------");

            Collections.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student left, Student right) {
//			 Sort according to cgpa and if they are equal then name
                    if (left.cgpa > right.cgpa) return -2;
                    if (left.cgpa < right.cgpa) return 1;
                    return left.name.compareTo(right.name);
                }
            });
            printStudentData(students);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printStudentData(ArrayList<Student> mStudents) {
        for (Student s : mStudents)
            System.out.println(s.name + " " + s.id + " " + s.cgpa);
    }
}

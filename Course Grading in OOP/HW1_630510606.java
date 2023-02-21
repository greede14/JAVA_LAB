/*
Anawin Athawong
630510606
*/

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

abstract class Course {
    protected String name;
    protected int credit;

    public void Course(String x, int y) {
        name = x;
        credit = y;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public abstract String getFinalLetterGrade(double grade);

    public abstract String getType();

}

class Student {
    private String name;
    private String major;
    private ArrayList<Course> Course = new ArrayList<Course>();
    private ArrayList<Double> RawGrades = new ArrayList<Double>();
    // private List<Course> course;
    // private double[] Rawgrades = new double[50];

    public Student(String x, String y) {
        name = x;
        major = y;

    }

    public void addCourse(Course course, double score) {
        Course.add(course);
        RawGrades.add(score);
    }

    public void printTranscript() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Major: %s\n", major);
        System.out.println("Course taken");

        System.out.printf("Course\tType\tCredit\tRawgrade\tLetterGrade\n");
        for (int i = 0; i < Course.size(); i++) {
            System.out.printf("%s\t%s\t%d\t%.2f\t\t%s \n", Course.get(i).getName(),
                    Course.get(i).getType(),
                    Course.get(i).getCredit(), RawGrades.get(i),
                    Course.get(i).getFinalLetterGrade(
                            RawGrades.get(i)));

        }
        System.out.printf("\nTotal Credits: %d\n", sumcredit());
        System.out.printf("Overall GPA: %.2f\n", calcredit());
    }

    private int sumcredit() {
        int tmp = 0;
        for (int i = 0; i < Course.size(); i++) {
            if (((Course) Course.get(i)).getFinalLetterGrade((double) RawGrades.get(i)) == "U") {
                continue;
            } else
                tmp += ((Course) Course.get(i)).getCredit();
        }
        return tmp;
    }

    private double calcredit() {
        double tmp = 0;
        double scalecredit = 0;
        for (int i = 0; i < Course.size(); i++) {
            if (((Course) Course.get(i)).getFinalLetterGrade((double) RawGrades.get(i)) == "U" || ((Course) Course
                    .get(i)).getFinalLetterGrade((double) RawGrades.get(i)) == "S") {
                continue;
            } else {
                if ((Course.get(i)).getFinalLetterGrade(RawGrades.get(i)) == "A")
                    tmp += 4 * Course.get(i).getCredit();
                else if ((Course.get(i)).getFinalLetterGrade(RawGrades.get(i)) == "B")
                    tmp += 3 * Course.get(i).getCredit();
                else if ((Course.get(i)).getFinalLetterGrade(RawGrades.get(i)) == "C")
                    tmp += 2 * Course.get(i).getCredit();
                else if ((Course.get(i)).getFinalLetterGrade(RawGrades.get(i)) == "D")
                    tmp += 1 * Course.get(i).getCredit();
                else
                    tmp += 0;

            }
            scalecredit += Course.get(i).getCredit();
        }
        return tmp / scalecredit;
    }
}

class SatisfactoryCourse extends Course {
    private double threshold;

    public SatisfactoryCourse(String x, int y, double z) {
        name = x;
        credit = y;
        threshold = z;
    }

    public String getFinalLetterGrade(double grade) {
        if (grade >= threshold)
            return "S";
        else
            return "U";
    }

    public String getType() {
        return "S/U";
    }

}

class ScaleCourse extends Course {
    private double[] scales;

    public ScaleCourse(String x, int y, double[] z) {
        name = x;
        credit = y;
        scales = z.clone();
    }

    public String getFinalLetterGrade(double grade) {
        if (grade >= scales[0])
            return "A";
        else if (grade >= scales[1])
            return "B";
        else if (grade >= scales[2])
            return "C";
        else if (grade >= scales[3])
            return "D";
        else if (grade >= scales[4])
            return "F";
        else
            return "cal grade error";
    }

    public String getType() {
        return "Scale";
    }
}
public class HW1_630510606 {
    public static void main(String[] args) {
        Student a = new Student("Vinai Lapan","Computer Science");

        double[] scalearray = {94.0,82.0,70.0,56.0,0.0}; //can not pass array directly to method so put it in variable first
        ScaleCourse c1 = new ScaleCourse("CS103", 4 , scalearray);
        SatisfactoryCourse c2=new SatisfactoryCourse("CS170", 3, 60);

        scalearray = new double[]{90.0,80.0,70.0,60.0,0.0};
        ScaleCourse c3= new ScaleCourse("CS270", 4,scalearray );

        scalearray = new double[]{92.5,82.5,70.0,60.0,0.0};
        ScaleCourse c4=new ScaleCourse("CS585", 4, scalearray);

        SatisfactoryCourse c5 =new SatisfactoryCourse("CS250", 2, 70);
        a.addCourse(c1, 94);
        a.addCourse(c2, 59);
        a.addCourse(c3, 90.5);
        a.addCourse(c4, 92);
        a.addCourse(c5, 70);
        a.printTranscript();


    }
}

/*
Anawin Athawong
630510606
*/
import java.math.BigInteger;
import java.util.Scanner;

class student {
    private int studentID;
    private int midScore;
    private int finalScore;
    private int totalScore;

    private String grade;

    public void setData() {
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Enter student ID: ");
            studentID = keyboard.nextInt();

        } while (studentID / 100000000 <= 1);
        do {
            System.out.print("Enter midterm and final score: ");
            midScore = keyboard.nextInt();
            finalScore = keyboard.nextInt();
            totalScore = midScore + finalScore;
        } while (midScore < 0 && midScore > 50 && finalScore < 0 && finalScore > 50);

    }

    public void calGrade() {
        if (totalScore < 45)
            grade = "F";
        else if (totalScore < 50)
            grade = "D";
        else if (totalScore < 55)
            grade = "D+";
        else if (totalScore < 60)
            grade = "C";
        else if (totalScore < 75)
            grade = "C+";
        else if (totalScore < 80)
            grade = "b";
        else if (totalScore < 85)
            grade = "B+";
        else
            grade = "A";
    }

    public void printResult() {
        System.out.printf("%d   %d      %s \n", studentID, totalScore, grade);
    }
}

public class Lab03_3_630510606 {
    public static void main(String[] args) {
        int n;
        Scanner x = new Scanner(System.in);
        System.out.printf("Enter N: ");
        n = x.nextInt();
        students[] v = new students[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter data for student #%d\n", i + 1);
            v[i] =new students();
            v[i].setData();
            v[i].calGrade();

        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",i+1);
            v[i].printResult();
        }
    }

}
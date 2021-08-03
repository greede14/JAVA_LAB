
/*
Anawin Athawong
630510606
*/

import java.util.Scanner;

class Grade_Subject {
    private char grade;
    private int gradepoint;
    private int credit;
    private static int totalcredit = 0;
    private static int totalpoint = 0;
    private static float GPA = 0;

    public void setData() {
        System.out.print("Input grade: ");
        Scanner Input = new Scanner(System.in);
        grade = Character.toUpperCase(Input.next().charAt(0));
        System.out.print("Input Credit: ");
        credit = Input.nextInt();

    }

    public void calGrade() {
        switch (grade) {
            case 'A':
                gradepoint = 4;
                break;
            case 'B':
                gradepoint = 3;
                break;
            case 'C':
                gradepoint = 2;
                break;
            case 'D':
                gradepoint = 1;
                break;
            case 'F':
                gradepoint = 0;
                break;
            default:
                break;
        }

        totalpoint += gradepoint * credit;
        totalcredit += credit;
    }

    public static void calGPA() {
        GPA = (float)totalpoint/(float)totalcredit;
    }

    public static float getGPA() {
        return GPA;
    }
    public static void printData(Grade_Subject[] subject){
        System.out.println("\t\tGrade\t\tGrade Point\t\tCredit\t\tTotal Point");
        for(int j=0; j< subject.length;j++){
            System.out.printf("Subject#%d\t%C\t\t\t%d\t\t  %d\t\t   %d\n",j+1,subject[j].grade,subject[j].gradepoint,subject[j].credit,subject[j].gradepoint * subject[j].credit);
        }
        System.out.println("Total   \t\t\t\t\t\t  "+ totalcredit+"\t\t   "+ totalpoint);
        System.out.printf("GPA = %.2f",Grade_Subject.getGPA());
    }

}

public class Lab05_1_630510606 {
    public static void main(String[] args) {
        System.out.print("Input N: ");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        Grade_Subject[] subject = new Grade_Subject[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Subject#%d\n",i+1);
            subject[i] = new Grade_Subject();
            subject[i].setData();
            subject[i].calGrade();
        }
        Grade_Subject.calGPA();
        //System.out.printf("GPA = %.2f",Grade_Subject.getGPA());
        Grade_Subject.printData(subject);
    }
}

/*
Anawin Athawong
630510606
*/

import java.util.Scanner;

class students {
    private String name;
    private int[] courseID;

    public void setData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Student name: ");
        name = input.nextLine();
        System.out.print("Number of subjects: ");
        courseID = new int[input.nextInt()];
        System.out.print("Course list : ");
        for (int i = 0; i < courseID.length; i++) {
            courseID[i] = input.nextInt();
        }

    }

    public boolean isAssignCourse(int x) {

        for (int i = 0; i < courseID.length; i++) {
            if (x == courseID[i])
                return true;

        }
        return false;

    }

    public String getname() {
        return name;
    }

}

public class Lab04_3_630510606 {

    // public int NumberOfStudentInClass(student a[],int x){
    // int y=0;
    // for(int i =0 ; i<a.length;i++){
    // if(a[i].isAssignCourse(x)) y++;
    // }
    // return y;
    // }
    public static void main(String[] args) {
        System.out.print("Input number of student: ");
        Scanner keyboard = new Scanner(System.in);
        students[] s = new students[keyboard.nextInt()];
        for (int i = 0; i < s.length; i++) {
            s[i] = new students();
            s[i].setData();
        }

        System.out.print("Input subject for searching : ");
        int searchID = keyboard.nextInt();
        for (int i = 0; i < s.length; i++) {
            if (s[i].isAssignCourse(searchID)) {
                System.out.println(s[i].getname());
            }
        }

    }
}
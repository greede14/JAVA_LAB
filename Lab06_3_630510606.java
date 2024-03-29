/*
Anawin Athawong
630510606
*/

import java.util.Scanner;

class Person {
    private String name;
    private int MStar;
    private int FStar;
    private static int M[] = { 0, 0, 0 }; //เก็บผลโหวตของทุกคนแล้วเอามารวมไว้ใน Array นี้
    private static int F[] = { 0, 0, 0 }; //เก็บผลโหวตของทุกคนแล้วเอามารวมไว้ใน Array นี้
    private static int mostM = 0; //เก็บตำแหน่งคนที่ได้รับโหวตมากที่สุด
    private static int mostF = 0; //เก็บตำแหน่งคนที่ได้รับโหวตมากที่สุด
    private static String Mname[] = { "Nadech", "Wier", "Mario" };
    private static String Fname[] = { "Aum", "Yaya", "Bella" };

    public void setData() {
        Scanner s = new Scanner(System.in);
        System.out.printf("Input name : ");
        name = s.nextLine();
        System.out.printf("Input number of actor and number of actress : ");
        MStar = s.nextInt(); //เก็บผลโหวต
        FStar = s.nextInt(); //เก็บผลโหวต

    }

    public static void checkAndPrintVote(Person a[]) { //เชคค่าที่โหวตของแต่ละคนเอามาเก็บไว้ใน Array ตำแหน่งนั้น
        for (int i = 0; i < a.length; i++) {
            M[a[i].MStar - 1] += 1;
            F[a[i].FStar - 1] += 1;
        }

        for (int j = 0; j < 3; j++) { //หาตำแหน่งคนที่ได้รับผมโหวตมากที่สุดใน Array
            if (mostM < M[j]) {
                mostM = j;
            }
            if (mostF < F[j]) {
                mostF = j;
            }
        }

    }

    public static void printResult() {
        System.out.printf("Top star award (Actor) goes to %s\n", Mname[mostM]);
        System.out.printf("Top star award (Actress) goes to %s\n", Fname[mostF]);
    }

    public static void printGoodLuckPeople(Person a[]) {
        System.out.print("Good luck voter -> ");
        for (int i = 0; i < a.length; i++) {
            if (mostM == a[i].MStar - 1 && mostF == a[i].FStar - 1) {
                System.out.print(a[i].name + " ");
            }
            // System.out.printf("\n%d %d %d %d", mostM, a[i].MStar, mostF, a[i].FStar);
        }

    }
}

public class Lab06_3_630510606 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Input N : ");
        int n = keyboard.nextInt();
        Person[] a = new Person[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Person();
            a[i].setData();
        }
        Person.checkAndPrintVote(a);
        Person.printResult();
        Person.printGoodLuckPeople(a);
    }
}
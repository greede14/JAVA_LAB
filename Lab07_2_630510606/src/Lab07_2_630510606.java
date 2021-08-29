/*
Anawin Athawong
630510606
*/

import java.util.Scanner;

class Lab07_2_630510606 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number of monthly employees : ");
        int Nmonthly = input.nextInt();
        MountlyEmployee M[] = new MountlyEmployee[Nmonthly];
        System.out.printf("\n\n");

        for (int i = 0; i < Nmonthly; i++) {
            System.out.printf("Input person #%d\n", i + 1);
            M[i] = new MountlyEmployee();
            M[i].setData();
            M[i].setSalary();
            M[i].caltotal();
            System.out.printf("\n\n");
        }
        System.out.println("………………………………………………");
        System.out.print("Input Number of weekly employees : ");
        int Nweekly = input.nextInt();
        WeeklyEmployee W[] = new WeeklyEmployee[Nweekly];
        System.out.printf("\n\n");
        for (int i = 0; i < Nweekly; i++) {
            System.out.printf("Input person #%d\n", i + 1);
            W[i] = new WeeklyEmployee();
            W[i].setData();
            W[i].setCommisionData();
            W[i].setWeeklyData();
            W[i].calCommision();
            W[i].calMonthlyWage();
            System.out.printf("\n\n");
        }

        System.out.println("………………………………………………");
        System.out.print("Input Number of daily employees : ");
        int Ndaily = input.nextInt();
        DailyEmployee D[] = new DailyEmployee[Ndaily];
        System.out.printf("\n\n");
        for (int i = 0; i < Ndaily; i++) {
            System.out.printf("Input person #%d\n", i + 1);
            D[i] = new DailyEmployee();
            D[i].setData();
            D[i].setCommisionData();
            D[i].setWeeklyData();
            D[i].calCommision();
            D[i].calMonthlyWage();
            System.out.printf("\n\n");
        }

        System.out.println("\t\t\tABC Company");
        MountlyEmployee.PrintData(M);
        WeeklyEmployee.PrintData(W);
        DailyEmployee.PrintData(D);
    }
}

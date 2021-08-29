import java.util.Scanner;

class WeeklyEmployee extends CommisionEmployee {
    private int weeklyrate;
    private int workingweek;
    protected static int TotalCommision =0;
    protected static int TotalMonthlyWage =0;
    protected static int TotalxTotal =0;

    public void setWeeklyData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input weekly rate : ");
        weeklyrate = input.nextInt();
        System.out.print("Input working week : ");
        workingweek = input.nextInt();
    }

    public void calMonthlyWage() {
        MonthlyWage = weeklyrate * workingweek;
        total = MonthlyWage + Commision;
        TotalxTotal += total;
        TotalMonthlyWage += MonthlyWage;
    }

    public void calCommision() {
        Commision = (float) TotalSale * ((float) PerrcentOfCommRate / 100);
        TotalCommision += Commision;

    }

    public static void PrintData(WeeklyEmployee x[]) {
        System.out.println();
        System.out.println("Weekly Employees");
        System.out.printf("ID\tName\t\tCommission\tMonthly wage\tTotal");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("\n%s\t%s\t\t%.0f\t\t%.0f\t\t%.0f", x[i].id, x[i].name, x[i].Commision, x[i].MonthlyWage,x[i].total);

        }
        System.out.printf("\nTotal\t\t\t%d\t\t%d\t\t%d\n", TotalCommision, TotalMonthlyWage, TotalxTotal);

    }
}
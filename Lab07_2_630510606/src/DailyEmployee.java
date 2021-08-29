import java.util.Scanner;

class DailyEmployee extends CommisionEmployee {
    private int dailyrate;
    private int workingday;
    protected static int TotalCommision =0;
    protected static int TotalMonthlyWage =0;
    protected static int TotalxTotal =0;

    public void setWeeklyData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input daily rate : ");
        dailyrate = input.nextInt();
        System.out.print("Input working day : ");
        workingday = input.nextInt();
    }

    public void calMonthlyWage() {
        MonthlyWage = dailyrate * workingday;
        total = MonthlyWage + Commision;
        TotalxTotal += total;
        TotalMonthlyWage += MonthlyWage;
    }

    public void calCommision() {
        Commision = (float) TotalSale * ((float) PerrcentOfCommRate / 100);
        TotalCommision += Commision;

    }

    public static void PrintData(DailyEmployee x[]) {
        System.out.println();
        System.out.println("Daily Employees");
        System.out.printf("ID\tName\t\tCommission\tMonthly wage\tTotal");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("\n%s\t%s\t\t%.0f\t\t%.0f\t\t%.0f", x[i].id, x[i].name, x[i].Commision, x[i].MonthlyWage,x[i].total);


        }
        System.out.printf("\nTotal\t\t\t%d\t\t%d\t\t%d\n",  TotalCommision, TotalMonthlyWage,TotalxTotal);

    }
}
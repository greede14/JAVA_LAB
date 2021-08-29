import java.util.Scanner;
class CommisionEmployee extends Employee {
    protected float Commision;
    protected int TotalSale;
    protected int PerrcentOfCommRate;
    protected float MonthlyWage;

    public void setCommisionData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input total sale : ");
        TotalSale = input.nextInt();
        System.out.print("Input percent of commission rate : ");
        PerrcentOfCommRate = input.nextInt();
    }

    public float getCommision() {
        return Commision;
    }

    public float getMonthlyWage() {
        return MonthlyWage;
    }
}
import java.util.Scanner;

class MountlyEmployee extends Employee {
    protected int salary;
    protected int OvertimeWage;
    protected static int TotalSalary=0;
    protected static int TotalOvertimeWage=0;
    protected static int TotalxTotal=0;

    public void setSalary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input salary : ");
        salary = input.nextInt();
        TotalSalary += salary;
        System.out.print("Input overtime period : ");
        OvertimeWage = input.nextInt()*200;
        TotalOvertimeWage+= OvertimeWage;
    }

    public void caltotal() {
        total = salary + OvertimeWage ;
        TotalxTotal += total;
    }

    public float gettotal() {
        return total;
    }

    public static void PrintData(MountlyEmployee x[]) {
        System.out.println();
        System.out.println("Monthly Employees");
        System.out.printf("ID\tName\t\tSalary\t\tOvertime wage\tTotal");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("\n%s\t%s\t\t%d\t\t%d\t\t%.0f", x[i].id, x[i].name, x[i].salary, x[i].OvertimeWage,x[i].total);

        }
        System.out.printf("\nTotal\t\t\t%d\t\t%d\t\t%d\n",  TotalSalary, TotalOvertimeWage,TotalxTotal);
    }

}
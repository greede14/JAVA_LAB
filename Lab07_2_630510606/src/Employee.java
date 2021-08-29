import java.util.Scanner;
class Employee {
    protected String id;
    protected String name;
    protected float total;

    public void setData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID : ");
        id = input.nextLine();
        System.out.print("Input name : ");
        name = input.nextLine();
    }
}
/*
Anawin Athawong
630510606
*/

import java.util.Scanner;

class human {
    protected String name;
    protected String lastname;
    protected int age;

    public void setData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first name: ");
        name = input.nextLine();
        System.out.print("Input last name: ");
        lastname = input.nextLine();
        System.out.print("Input age: ");
        age = input.nextInt();
    }



    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return name;
    }

    public String getLastName() {
        return lastname;
    }

}

class student extends human {
    private int years;

    public void setYears() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input study year: ");
        years = input.nextInt();
    
    }

    public int getYears() {
        return years;
    }

    static void printAllStudents(student x[], int y) {
        System.out.println("\nStudent");
        System.out.println("\tFirstName\tLastName\tAge\tYears\n");
        for (int i = 0; i < y; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\n", i + 1, x[i].name, x[i].lastname, x[i].age, x[i].years);
        }
    }
    public static float calAndPrintAvgAge(student x[],int y) {
        int sum=0;
        for (int i = 0;i<y;i++){
            sum += x[i].age;
        }
        sum= sum/y;
        return sum;
    }
}

class teacher extends human {
    private int salary;
    private static int belowAvgAge=0;

    public void setSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input salary: ");
        salary = sc.nextInt();
        
    }

    public int getSalary() {
        return salary;
    }

    static void printAllTeachers(teacher x[], int y) {
        System.out.println("\nTeacher");
        System.out.println("\tFirstName\tLastName\tAge\tSalary\n");
        for (int i = 0; i < y; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\n", i + 1, x[i].name, x[i].lastname, x[i].age, x[i].salary);
        }
    }
    static void countTeacher(teacher x[],float y){
        for (int i = 0; i <x.length; i++) {
            if(x[0].age<y) belowAvgAge += 1;
        }
        System.out.printf("\nNumber of teachers who have age below average = %d ",belowAvgAge);
    }
    public static float calAndPrintAvgAge(teacher x[],int y) {
        int sum=0;
        for (int i = 0;i<y;i++){
            sum += x[i].age;
        }
        sum= sum/y;
        return sum;
    }
}

class Lab07_1_630510606 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = keyboard.nextInt();
        student[] s = new student[n];
        teacher[] t = new teacher[n];
        int si = 0, ti = 0;
        char choice;
        

        for (int i = 0; i < n; i++) {
            System.out.printf("\nInput person #%d (Teacher or Student) : ", i + 1);
            choice = keyboard.next().charAt(0);
            if (choice == 's' || choice == 'S') {
                s[si] = new student();
                s[si].setData();
                s[si].setYears();
                si++;
            } else {
                t[ti] = new teacher();
                t[ti].setData();
                t[ti].setSalary();
                ti++;
            }
        }
        
        if (si != 0)
            student.printAllStudents(s, si);
        if (ti != 0)
            teacher.printAllTeachers(t, ti);

        System.out.printf("\nAverage of student age = %.2f",student.calAndPrintAvgAge(s,si));
        System.out.printf("\nAverage of teacher age = %.2f",teacher.calAndPrintAvgAge(t,ti));
        teacher.countTeacher(t,teacher.calAndPrintAvgAge(t,ti));
    }
}
/*
Anawin Athawong
630510606
*/

import java.util.Scanner;

class WeightStandarts {
    private String name;
    private int height;
    private int weight;
    private char gender;

    public void setData() {
        Scanner input = new Scanner(System.in);

        System.out.printf("\nInput name : ");
        name = input.nextLine();
        System.out.printf("Input height : ");
        height = input.nextInt();
        System.out.printf("Input weight : ");
        weight = input.nextInt();
        System.out.printf("Input sex : ");
        gender = Character.toUpperCase(input.next().charAt(0));
        

    }

    private int calCloseWeightStandarts() {
        if (gender == 'M') {
            return Math.abs(height - 100 - weight);
        }else if(gender == 'F') {
            return Math.abs(height - 110 - weight);
        }
        else{
            return 0;
        }

    }

    public static void calWeightStandard(WeightStandarts a, WeightStandarts b) {
        if (a.calCloseWeightStandarts() < b.calCloseWeightStandarts()) {
            System.out.printf("Weight of %s is closer to standard weight than %s", a.name, b.name);
        } else if (a.calCloseWeightStandarts() > b.calCloseWeightStandarts()) {
            System.out.printf("Weight of %s is closer to standard weight than %s", b.name, a.name);
        } else {
            System.out.printf("The weight of both of them are close to the standard weight equally.");
        }
    }

}

public class Lab06_2_630510606 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        WeightStandarts a[] = new WeightStandarts[2];

        for (int i = 0; i < 2; i++) {
            System.out.printf("Input data for person #%d : ", i + 1);
            a[i] = new WeightStandarts();
            a[i].setData();
        }

        WeightStandarts.calWeightStandard(a[0], a[1]);

    }
}

/*
Anawin Athawong
630510606
*/
import java.util.Scanner;

class human {
    private char gender;
    private float weight;
    private float height;
    private String shape;

    public void setData() {
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Enter gender: ");
            gender = Character.toLowerCase(keyboard.nextLine().charAt(0));
        } while (gender != 'm' && gender != 'f');

        System.out.print("Enter weight: ");
        weight = keyboard.nextInt();

        System.out.print("Enter height: ");
        height = keyboard.nextInt();
    }

    public void calShape() {
        if (gender == 'm') {
            if (weight <= (height - 100)) {
                shape = "Your shape is OK.";
            } else {
                shape = "Your shape is not OK.";
            }
        } else {
            if (weight <= (height - 110)) {
                shape = "Your shape is OK.";
            } else {
                shape = "Your shape is not OK.";
            }

        }
    }

    public void printResult() {
        System.out.print(shape);
    }

}

public class Lab03_1_630510606 {
    public static void main(String[] args) {
        human h = new human(); // h= instant of human class
        h.setData();
        h.calShape();
        h.printResult();
    }
}
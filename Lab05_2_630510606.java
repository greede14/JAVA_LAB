
/*
Anawin Athawong
630510606
*/
import java.util.Scanner;

class Box {
    private float width, height, length, volume;
    private String name;

    public Box() {
        System.out.printf("Hello from 2nd constructor\n");
    };

    public Box(String a, float x, float y, float z) {
        System.out.printf("Hello from 1st constructor\n");
        name = a;
        width = x;
        length = y;
        height = z;
    }

    public void setData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Name of Box: ");
        name = input.nextLine();
        System.out.print("Input Width: ");
        width = input.nextFloat();
        System.out.print("Input Length: ");
        length = input.nextFloat();
        System.out.print("Input Height: ");
        height = input.nextFloat();

    }

    public void calVolume() {
        volume = width * length * height;
    }

    public void display() {
        System.out.printf("The volume of Box: %s = %.1f \n", name, volume);
    }
}

public class Lab05_2_630510606 {
    public static void main(String[] args) {

        Box a = new Box("SizeA", 14, 20, 6);
        a.calVolume();
        a.display();

        Box b = new Box();
        b.setData();
        b.calVolume();
        b.display();

    }
}
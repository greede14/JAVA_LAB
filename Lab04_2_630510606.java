
/*
Anawin Athawong
630510606
*/

import java.util.Scanner;

class massange {
    private char[] text;

    public void setData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input text : ");
        text = input.nextLine().toCharArray();
    }

    public void encode() {
        for (int i = 0; i < text.length; i++) {
            text[i] += 3;
            text[i] = Character.toUpperCase(text[i]);

        }
    }

    public void printResult() {
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
            if ((i + 1) % 3 == 0)
                System.out.print(" ");
        }
        for (int i = 0; i < 3-text.length%3 && text.length%3!=0; i++) {
            System.out.print("#");
        }
    }
}

public class Lab04_2_630510606{
    public static void main(String[] args) {
        massange t =new massange();
        t.setData();
        t.encode();
        t.printResult();
    }
}

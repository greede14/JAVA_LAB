
/*
Anawin Athawong
630510606
*/
import java.util.Scanner;

class Menu {
    private static int choice;

    public static void setChoice() {
        Scanner input = new Scanner(System.in);
        System.out.printf("**********\n1.push\n2.pop\n3.show\n4.exit\n**********\nPlease select choice : ");
        do {
            choice = input.nextInt();
        } while (choice > 4 && choice < 1);

    }

    public static int getChoice() {
        return choice;
    }
}

class Stack {
    int item[] = new int[5];// ;
    int top;



    public Stack() {
        top = -1;
    }

    public void push(int x) {
        if (!isFull()) {
            item[++top] = x;

        } else {
            System.out.printf("stack is full.\n");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            System.out.printf("%d\n", item[top--]);
        } else {
            System.out.printf("stack is empty.\n");
        }
    }

    public void show() {
        if (!isEmpty()) {
            for (int i = 0; i < top; i++) {
                System.out.print(item[i]);
                System.out.print(" ");
            }
            System.out.println();

        } else {
            System.out.printf("stack is empty.\n");
        }
    }

    private boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isFull() {
        if (top == 4) {
            return true;
        } else {
            return false;
        }
    }
}

public class Lab05_3_630510606 {
    public static void main(String[] args) {
        Stack t = new Stack();
        Menu menu = new Menu();
    do{
        Menu.setChoice();

    }while ()
        
    }
}